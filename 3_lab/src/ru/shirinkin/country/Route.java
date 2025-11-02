package ru.shirinkin.country;

import java.util.*;

public class Route {
    private City start;
    private City end;

    // Конструктор
    public Route(City start, City end) {
        if (start == null || end == null) {
            throw new IllegalArgumentException("Город начала и конца пути не могут быть null");
        }
        this.start = start;
        this.end = end;
    }

    // Свойства
    public City getStart() {
        return start;
    }

    public void setStart(City start) {
        if (start == null) {
            throw new IllegalArgumentException("Город начала пути не может быть null");
        }
        this.start = start;
    }

    public City getEnd() {
        return end;
    }

    public void setEnd(City end) {
        if (end == null) {
            throw new IllegalArgumentException("Город конца пути не может быть null");
        }
        this.end = end;
    }

    // Основной метод - получение маршрута как массива городов
    public City[] getRoute() {
        if (start.equals(end)) {
            // Если начало и конец совпадают
            return new City[]{start};
        }

        // Используем BFS для поиска пути через наименьшее число городов
        Map<City, City> previous = new HashMap<>();
        Queue<City> queue = new LinkedList<>();
        Set<City> visited = new HashSet<>();

        queue.offer(start);
        visited.add(start);
        previous.put(start, null);

        while (!queue.isEmpty()) {
            City current = queue.poll();

            // Получаем соседние города
            Map<City, Integer> neighbors = current.getRoutes();

            for (City neighbor : neighbors.keySet()) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    previous.put(neighbor, current);
                    queue.offer(neighbor);

                    // Если нашли конечный город
                    if (neighbor.equals(end)) {
                        return buildPath(previous);
                    }
                }
            }
        }

        // Путь не найден
        return new City[0];
    }

    // Восстановление пути из карты предыдущих городов
    private City[] buildPath(Map<City, City> previous) {
        List<City> path = new ArrayList<>();
        City current = end;

        // Восстанавливаем путь от конца к началу
        while (current != null) {
            path.add(current);
            current = previous.get(current);
        }

        // Разворачиваем путь (от начала к концу)
        Collections.reverse(path);
        return path.toArray(new City[0]);
    }

    // Строковое представление маршрута
    @Override
    public String toString() {
        City[] route = getRoute();
        if (route.length == 0) {
            return "Маршрут из '" + start.getName() + "' в '" + end.getName() + "' не найден";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("Маршрут: ");
        for (int i = 0; i < route.length; i++) {
            sb.append(route[i].getName());
            if (i < route.length - 1) {
                sb.append(" - ");
            }
        }
        sb.append(" (всего ").append(route.length).append(" городов)");
        return sb.toString();
    }

    // Дополнительные полезные методы
    public int getRouteLength() {
        return getRoute().length;
    }

    public boolean isRouteExists() {
        return getRoute().length > 0;
    }
}
package ru.shirinkin.country;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public final class City {
    private final String name;
    private final Map<City, Integer> routes;

    // Конструкторы
    public City(String name) {
        this.name = name;
        this.routes = new HashMap<>();
    }

    public City(String name, Map<City, Integer> initialRoutes) {
        this.name = name;
        this.routes = new HashMap<>();
        if (initialRoutes != null) {
            // Добавляем маршруты с проверкой уникальности
            for (Map.Entry<City, Integer> entry : initialRoutes.entrySet()) {
                City targetCity = entry.getKey();
                int weight = entry.getValue();
                if (isValidRoute(targetCity, weight)) {
                    routes.put(targetCity, weight);
                }
            }
        }
    }

    // Свойства
    public String getName() {
        return name;
    }

    // Методы
    public void addRoute(City targetCity, int weight) {
        if (!isValidRoute(targetCity, weight)) {
            return;
        }

        // Проверяем, существует ли уже маршрут
        if (routes.containsKey(targetCity)) {
            System.out.println("Маршрут из '" + name + "' в '" + targetCity.getName() +
                    "' уже существует. Обновляем расстояние с " +
                    routes.get(targetCity) + " на " + weight);
        } else {
            System.out.println("Добавлен маршрут: '" + name + "' - '" +
                    targetCity.getName() + "' (" + weight + " км)");
        }

        routes.put(targetCity, weight);
    }

    public void removeRoute(City targetCity) {
        if (targetCity == null) {
            System.out.println("Ошибка: город назначения не может быть null");
            return;
        }

        if (routes.containsKey(targetCity)) {
            int removedWeight = routes.remove(targetCity);
            System.out.println("Удален маршрут: '" + name + "' - '" +
                    targetCity.getName() + "' (" + removedWeight + " км)");
        } else {
            System.out.println("Маршрут из '" + name + "' в '" +
                    targetCity.getName() + "' не найден");
        }
    }

    public Map<City, Integer> getRoutes() {
        return new HashMap<>(routes);
    }

    public boolean hasRouteTo(City targetCity) {
        return routes.containsKey(targetCity);
    }

    public Integer getRouteDistance(City targetCity) {
        return routes.get(targetCity);
    }

    // Приватные вспомогательные методы
    private boolean isValidRoute(City targetCity, int weight) {
        if (targetCity == null) {
            System.out.println("Ошибка: город назначения не может быть null");
            return false;
        }

        if (targetCity == this) {
            System.out.println("Ошибка: нельзя создать маршрут из города '" +
                    name + "' в самого себя");
            return false;
        }

        if (weight <= 0) {
            System.out.println("Ошибка: расстояние должно быть положительным числом");
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Город: '").append(name).append("'");

        if (routes.isEmpty()) {
            sb.append("\nНет прямых маршрутов в другие города");
        } else {
            sb.append("\nПрямые маршруты:");
            for (Map.Entry<City, Integer> entry : routes.entrySet()) {
                sb.append("\n  - '")
                        .append(entry.getKey().getName())
                        .append("' (")
                        .append(entry.getValue())
                        .append(" км)");
            }
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        City other = (City) obj;

        // Сравниваем наборы маршрутов
        if (routes.size() != other.routes.size()) {
            return false;
        }

        // Проверяем, что все маршруты одинаковые
        for (Map.Entry<City, Integer> entry : routes.entrySet()) {
            City targetCity = entry.getKey();
            Integer distance = entry.getValue();
            Integer otherDistance = other.routes.get(targetCity);
            System.out.println(other.routes.get(targetCity));
            // Если в другом городе нет такого маршрута или расстояния не совпадают
            if (otherDistance == null || !otherDistance.equals(distance)) {
                return false;
            }
        }

        return true;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
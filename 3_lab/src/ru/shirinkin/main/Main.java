package ru.shirinkin.main;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import ru.shirinkin.country.*;
import ru.shirinkin.math.*;
import ru.shirinkin.people.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Fraction");
        System.out.println("2. City");
        System.out.println("3. Fraction ??");
        System.out.println("4. Fraction <3");
        System.out.println("5. Sum");
        System.out.println("6. City");
        System.out.println("7. Package");
        System.out.println("8. Dot");
        System.out.println("Enter your choice: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                // Создание дробей с отрицательными значениями
                Fraction1ex f1 = new Fraction1ex(2, 3);
                Fraction1ex f2 = new Fraction1ex(-1, 4);
                Fraction1ex f3 = new Fraction1ex(3, -6); // Должно стать -1/2
                Fraction1ex f4 = new Fraction1ex(-4, -8); // Должно стать 1/2

                System.out.println("f1 = " + f1); // 2/3
                System.out.println("f2 = " + f2); // -1/4
                System.out.println("f3 = " + f3); // -1/2
                System.out.println("f4 = " + f4); // 1/2

                System.out.println("\nАрифметические операции:");
                System.out.println(f1 + " + " + f2 + " = " + f1.add(f2)); // 2/3 + (-1/4) = 5/12
                System.out.println(f1 + " - " + f2 + " = " + f1.subtract(f2)); // 2/3 - (-1/4) = 11/12
                System.out.println(f1 + " * " + f2 + " = " + f1.multiply(f2)); // 2/3 * (-1/4) = -1/6
                System.out.println(f1 + " / " + f2 + " = " + f1.divide(f2)); // 2/3 / (-1/4) = -8/3

                System.out.println("\nОперации с целыми числами:");
                System.out.println(f1 + " + 2 = " + f1.add(2)); // 2/3 + 2 = 8/3
                System.out.println(f1 + " * 3 = " + f1.multiply(3)); // 2/3 * 3 = 2

                System.out.println("\nПроверка неизменяемости:");
                Fraction1ex original = new Fraction1ex(3, 4);
                Fraction1ex result = original.add(new Fraction1ex(1, 2));
                System.out.println(original + " + 1/2 = " + result);
                System.out.println("Исходная дробь не изменилась: " + original);

                // Создаем города
                City moscow = new City("Москва");
                City spb = new City("Санкт-Петербург");
                City kazan = new City("Казань");
                City sochi = new City("Сочи");

                System.out.println("1. Создание маршрутов:");
                moscow.addRoute(spb, 700);
                moscow.addRoute(kazan, 800);
                spb.addRoute(sochi, 1800);

                System.out.println("\n2. Проверка дублирования маршрутов:");
                // Попытка добавить дублирующий маршрут - будет обновлен
                moscow.addRoute(spb, 710);

                System.out.println("\n3. Попытка некорректных операций:");
                moscow.addRoute(moscow, 100);  // Маршрут в себя
                moscow.addRoute(null, 100);    // Маршрут в null
                moscow.addRoute(spb, -50);     // Отрицательное расстояние

                System.out.println("\n4. Создание города с заранее заданными маршрутами:");
                Map<City, Integer> initialRoutes = new HashMap<>();
                initialRoutes.put(moscow, 400);
                initialRoutes.put(spb, 300);
                City novosibirsk = new City("Новосибирск", initialRoutes);

                System.out.println("\n" + novosibirsk);

                System.out.println("\n5. Информация о городах:");
                System.out.println(moscow);
                System.out.println("\n" + spb);
                System.out.println("\n" + kazan);

                System.out.println("\n6. Проверка существования маршрутов:");
                System.out.println("Из Москвы в СПб: " + moscow.hasRouteTo(spb));
                System.out.println("Из Москвы в Сочи: " + moscow.hasRouteTo(sochi));
                System.out.println("Расстояние Москва-СПб: " + moscow.getRouteDistance(spb) + " км");

                System.out.println("\n7. Удаление маршрутов:");
                moscow.removeRoute(kazan);
                moscow.removeRoute(sochi); // Несуществующий маршрут

                System.out.println("\n8. Финальное состояние:");
                System.out.println(moscow);

                System.out.println("\n=== Демонстрация транзитивных маршрутов ===");
                System.out.println("Прямой маршрут Москва-Сочи: " + moscow.hasRouteTo(sochi));
                System.out.println("Но возможен транзит: Москва - СПб - Сочи");
                System.out.println("Москва-СПб: " + moscow.hasRouteTo(spb) + " (" + moscow.getRouteDistance(spb) + " км)");
                System.out.println("СПб-Сочи: " + spb.hasRouteTo(sochi) + " (" + spb.getRouteDistance(sochi) + " км)");
                break;
            case 2:
                // Создаем города
                City cityA = new City("A");
                City cityB = new City("B");
                City cityC = new City("C");
                City cityD = new City("D");
                City cityE = new City("E");
                City cityF = new City("F");

                // Создаем связи между городами
                cityA.addRoute(cityB, 1);
                cityA.addRoute(cityC, 1);
                cityB.addRoute(cityD, 1);
                cityC.addRoute(cityD, 1);
                cityD.addRoute(cityE, 1);
                cityE.addRoute(cityF, 1);

                System.out.println("=== Демонстрация работы маршрута ===\n");

                // Создаем маршрут из F в D
                Route routeFD = new Route(cityF, cityD);
                System.out.println("1. Маршрут из F в D:");
                System.out.println(routeFD);
                System.out.println("Массив городов: " + Arrays.toString(routeFD.getRoute()));
                System.out.println("Длина маршрута: " + routeFD.getRouteLength() + " городов");
                System.out.println("Существует ли маршрут: " + routeFD.isRouteExists());

                System.out.println("\n2. Другие маршруты:");

                // Маршрут из A в F
                Route routeAF = new Route(cityA, cityF);
                System.out.println(routeAF);

                // Маршрут из B в C
                Route routeBC = new Route(cityB, cityC);
                System.out.println(routeBC);

                System.out.println("\n3. Изменение точек маршрута:");
                Route dynamicRoute = new Route(cityA, cityB);
                System.out.println("Изначально: " + dynamicRoute);

                dynamicRoute.setEnd(cityF);
                System.out.println("После изменения конца: " + dynamicRoute);

                dynamicRoute.setStart(cityF);
                System.out.println("После изменения начала: " + dynamicRoute);

                System.out.println("\n4. Невозможный маршрут:");
                // Создаем изолированный город
                City isolatedCity = new City("Isolated");
                Route impossibleRoute = new Route(cityA, isolatedCity);
                System.out.println(impossibleRoute);
                System.out.println("Массив: " + Arrays.toString(impossibleRoute.getRoute()));

                System.out.println("\n5. Проверка обработки ошибок:");
                try {
                    Route badRoute = new Route(null, cityA);
                } catch (IllegalArgumentException e) {
                    System.out.println("Поймана ошибка: " + e.getMessage());
                }

                try {
                    Route route = new Route(cityA, cityB);
                    route.setStart(null);
                } catch (IllegalArgumentException e) {
                    System.out.println("Поймана ошибка: " + e.getMessage());
                }

                break;

            case 3:
                System.out.println("Так они и так не менялись, че там делать. Final дописал))");
                break;

            case 4:
                Fraction f = new Fraction(7, 4);      // 7/4 = 1.75

                int intVal = f.intValue();            // 1 (целая часть)
                long longVal = f.longValue();         // 1L
                float floatVal = f.floatValue();      // 1.75f
                double doubleVal = f.doubleValue();   // 1.75

                System.out.println("int: " + intVal);
                System.out.println("long: " + longVal);
                System.out.println("float: " + floatVal);
                System.out.println("double: " + doubleVal);
                return;

            case 5:
                SimpleSum simpleSum = new SimpleSum();
                // 1. 2 + 3/5 + 2.3
                double result1 = simpleSum.sum(2, 3.0/5, 2.3);
                System.out.print("1. 2 + 3/5 + 2.3 = " + result1);

                // 2. 3.6 + 49/12 + 3 + 3/2
                double result2 = simpleSum.sum(3.6, 49.0/12, 3, 3.0/2);
                System.out.print("\n2. 3.6 + 49/12 + 3 + 3/2 = " + result2);

                // 3. 1/3 + 1
                double result3 = simpleSum.sum(1.0/3, 1);
                System.out.print("\n3. 1/3 + 1 = " + result3);

                break;

            case 6:
                City city1 = new City("Город А");
                City city2 = new City("Город Б");
                City city3 = new City("Город В");

                // Создаем два города с одинаковыми маршрутами
                City cityA2 = new City("Город А");
                cityA2.addRoute(city2, 100);
                cityA2.addRoute(city3, 200);

                City cityB2 = new City("Город Б");
                cityB2.addRoute(city2, 100);
                cityB2.addRoute(city3, 200);

                // Теперь cityA и cityB будут считаться равными, т.к. у них одинаковые маршруты
                System.out.println("Города равны: " + cityA2.equals(cityB2)); // true

                // Если изменить маршрут в одном из городов
                cityB2.addRoute(city1, 50);
                System.out.println("Города равны: " + cityA2.equals(cityB2)); // false

                break;
            case 7:
                System.out.println("Всё и так через пакеты.");
                // с запуском с параметрами не разобрался :(
                break;

            case 8:
                // Создаем оригинальную точку
                Dot original2 = new Dot(5, 10);
                System.out.println("Оригинальная точка: " + original2);

                // Клонируем точку
                Dot cloned = original2.clone();
                System.out.println("Клонированная точка: " + cloned);

                // Проверяем, что это разные объекты
                System.out.println("Это один и тот же объект? " + (original2 == cloned));
                System.out.println("Координаты одинаковые? " +
                        (original2.getX() == cloned.getX() && original2.getY() == cloned.getY()));

                // Меняем оригинальную точку
                original2.setCoordinate(20, 30);
                System.out.println("\nПосле изменения оригинала:");
                System.out.println("Оригинальная точка: " + original2);
                System.out.println("Клонированная точка: " + cloned);

                // Создаем еще один клон
                Dot anotherClone = original2.clone();
                System.out.println("Еще один клон: " + anotherClone);
                break;
            default:
                System.out.println("Exit...");
                break;
        }
    }
}

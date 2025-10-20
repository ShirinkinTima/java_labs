import java.util.HashMap;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Class Human and class Name");
        System.out.println("2. Class Human with class Name");
        System.out.println("3. Cities");
        System.out.println("4. City constructor");
        System.out.println("5. Fraction");
        System.out.println("Enter your choice: ");
        int choice = scanner.nextInt();
        switch (choice) {
//            case 1:
//                Dot dot1 = new Dot();
//                Dot dot2 = new Dot(1, 2);
//                Dot dot3 = new Dot(dot2);
//                System.out.println("d1 " + dot1.toString());
//                System.out.println("d2 " + dot2.toString());
//                System.out.println("d3 " + dot3.toString());
//
//                dot3.setCoordinate(dot1.getX(), dot1.getY());
//                System.out.println("\nd3 " + dot3.toString());
//                break;
            case 1:
                // Задания 1.2, 1.3
                Human human1 = new Human("Клеопатра", 152);
                Human human2 = new Human("Пушкин", 167);
                Human human3 = new Human("Владимир", 189);
                System.out.println(human1);
                System.out.println(human2);
                System.out.println(human3);
                Name name1 = new Name("", "Клеопатра", "");
                Name name2 = new Name("Пушкин", "Александр", "Сергеевич");
                Name name3 = new Name("Маяковский", "Владимир", "");
                System.out.println(name1);
                System.out.println(name2);
                System.out.println(name3);
                break;
            case 2:
                // Задание 2.2
                Name name4 = new Name("", "Клеопатра", "");
                Name name5 = new Name("Пушкин", "Александр", "Сергеевич");
                Name name6 = new Name("Маяковский", "Владимир", "");
                HumanWithName humanWithName4 = new HumanWithName(name4, 152);
                HumanWithName humanWithName5 = new HumanWithName(name5, 167);
                HumanWithName humanWithName6 = new HumanWithName(name6, 189);
                System.out.println(humanWithName4);
                System.out.println(humanWithName5);
                System.out.println(humanWithName6);
                break;
            case 3:
                // Задание 3.3
                City a = new City("A");
                City b = new City("B");
                City c = new City("C");
                City d = new City("D");
                City e = new City("E");
                City f = new City("F");

                a.addRoute(b, 5);
                b.addRoute(a, 5);
                a.addRoute(d, 6);
                d.addRoute(a, 6);
                a.addRoute(f, 1); // нет обратной дороги

                f.addRoute(b, 1); // нет обратной дороги
                f.addRoute(e, 2);
                e.addRoute(f, 2);

                b.addRoute(c,3);
                c.addRoute(b,3);

                c.addRoute(d, 4);
                d.addRoute(c, 4);

                d.addRoute(e, 2);

                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
                System.out.println(d);
                System.out.println(e);
                System.out.println(f);

                a.removeRoute(c);
                break;
            case 4:
                // Задание 4.8
                City i = new City("I");
                City j= new City("J");
                City k = new City("K");
                HashMap<City, Integer> routes = new HashMap<>();
                routes.put(i, 1);
                routes.put(j, 2);
                routes.put(k, 3);
                City testCity = new City("testCity", routes);
                System.out.println(testCity);
            case 5:
                // Задание 5.5
                Fraction f1 = new Fraction(1, 3);
                Fraction f2 = new Fraction(2, 3);
                Fraction f3 = new Fraction(2, 9);
                System.out.println(f1 + " * " + f2 + " = "  + f1.multiply(f2));
                System.out.println(f1.add(f2).divide(f3).subtract(5));

                System.out.println(f1.multiply(f2));
                System.out.println(f1.add(f2));
                System.out.println(f1.divide(f2));
                System.out.println(f1.subtract(f2));
                f1.setNumerator(999);
                System.out.println(f1);
                f1.setDenominator(999);
                System.out.println(f1);

            default:
                break;
        }


    }
}
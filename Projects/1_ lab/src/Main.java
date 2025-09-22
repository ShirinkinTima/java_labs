import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FunctionGoogleCS function = new FunctionGoogleCS();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Доступные методы:");
        System.out.println(" 1. sumLastNums - Сумма двух последних цифр числа");
        System.out.println(" 2. isPositive - Проверка положительного числа");
        System.out.println(" 3. isUpperCase - Проверка заглавной буквы");
        System.out.println(" 4. isDivisor - Проверка делимости чисел");
        System.out.println(" 5. lastNumSum - Сумма последних цифр двух чисел");
        System.out.println(" 6. safeDiv - Безопасное деление");
        System.out.println(" 7. makeDecision - Сравнение двух чисел");
        System.out.println(" 8. sum3 - Проверка суммы трех чисел");
        System.out.println(" 9. age - Возраст с правильным окончанием");
        System.out.println("10. printDays - Вывод дней недели");
        System.out.println("11. reverseListNums - Обратный список чисел");
        System.out.println("12. pow - Возведение в степень");
        System.out.println("13. equalNum - Проверка одинаковых цифр");
        System.out.println("14. leftTriangle - Вывод треугольника");
        System.out.println("15. guessGame - Игра 'Угадай число'");
        System.out.println("16. findLast - Поиск последнего вхождения");
        System.out.println("17. add - Добавление элемента в массив");
        System.out.println("18. reverse - Разворот массива");
        System.out.println("19. concat - Объединение массивов");
        System.out.println("20. deleteNegative - Удаление отрицательных чисел");
        System.out.println(" 0. Выход");

        while (true) {
            System.out.print("\nВыберите метод (0-20): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("Выход...");
                    scanner.close();
                    return;

                case 1:
                    System.out.println("Находит сумму двух последних цифр числа.");
                    System.out.print("Введите число: ");
                    int num1 = scanner.nextInt();
                    System.out.println("Результат: " + function.sumLastNums(num1));
                    break;

                case 2:
                    System.out.println("Возвращает результат сравнения x > 0.");
                    System.out.print("Введите число: ");
                    int num2 = scanner.nextInt();
                    System.out.println("Результат: " + function.isPositive(num2));
                    break;

                case 3:
                    System.out.println("Является ли буква заглавной.");
                    System.out.print("Введите символ: ");
                    char ch = scanner.next().charAt(0);
                    System.out.println("Результат: " + function.isUpperCase(ch));
                    break;

                case 4:
                    System.out.println("Проверяет делимость первого числа на второе.");
                    System.out.print("Введите два числа: ");
                    int a4 = scanner.nextInt();
                    int b4 = scanner.nextInt();
                    System.out.println("Результат: " + function.isDivisor(a4, b4));
                    break;

                case 5:
                    System.out.println("Складывает разряды единиц для двух чисел.");
                    System.out.print("Введите два числа: ");
                    int a5 = scanner.nextInt();
                    int b5 = scanner.nextInt();
                    System.out.println("Результат: " + function.lastNumSum(a5, b5));
                    break;

                case 6:
                    System.out.println("Возвращает разность, если второе число - не ноль, иначе - ошибка.");
                    System.out.print("Введите делимое и делитель: ");
                    int x6 = scanner.nextInt();
                    int y6 = scanner.nextInt();
                    System.out.println("Результат: " + function.safeDiv(x6, y6));
                    break;

                case 7:
                    System.out.println("Сравнение двух чисел. Результат - строка.");
                    System.out.print("Введите два числа: ");
                    int x7 = scanner.nextInt();
                    int y7 = scanner.nextInt();
                    System.out.println("Результат: " + function.makeDecision(x7, y7));
                    break;

                case 8:
                    System.out.println("Если одно число является результатом сложения двух других - True, иначе - False.");
                    System.out.print("Введите три числа: ");
                    int x8 = scanner.nextInt();
                    int y8 = scanner.nextInt();
                    int z8 = scanner.nextInt();
                    System.out.println("Результат: " + function.sum3(x8, y8, z8));
                    break;

                case 9:
                    System.out.println("Правильно пишет падеж для возраста.");
                    System.out.print("Введите возраст: ");
                    int age = scanner.nextInt();
                    System.out.println("Результат: " + function.age(age));
                    break;

                case 10:
                    System.out.println("Хвастается, что по порядку знает дни недели.");
                    System.out.print("Введите день недели С МАЛЕНЬКОЙ буквы: ");
                    scanner.nextLine(); // очистка буфера
                    String day = scanner.nextLine();
                    function.printDays(day);
                    break;

                case 11:
                    System.out.println("Считает от вашего числа до нуля.");
                    System.out.print("Введите число: ");
                    int num11 = scanner.nextInt();
                    System.out.println("Результат: " + function.reverseListNums(num11));
                    break;

                case 12:
                    System.out.println("Возводит в степень.");
                    System.out.print("Введите основание и степень: ");
                    int base = scanner.nextInt();
                    int exp = scanner.nextInt();
                    System.out.println("Результат: " + function.pow(base, exp));
                    break;

                case 13:
                    System.out.println("Если число из одной цифры - True, иначе - False.");
                    System.out.print("Введите число: ");
                    int num13 = scanner.nextInt();
                    System.out.println("Результат: " + function.equalNum(num13));
                    break;

                case 14:
                    System.out.println("Красивая ёлочка");
                    System.out.print("Введите размер: ");
                    int size = scanner.nextInt();
                    function.leftTriangle(size);
                    break;

                case 15:
                    System.out.println("Угадай число от 0 до 9 или умри.");
                    System.out.println();
                    function.guessGame();
                    break;

                case 16:
                    System.out.println("Вернёт индекс последнего вхождения вашего числа в ваш массив");
                    System.out.print("Введите размер массива: ");
                    int size16 = scanner.nextInt();
                    int[] arr16 = new int[size16];
                    System.out.println("Введите элементы массива:");
                    for (int i = 0; i < size16; i++) {
                        arr16[i] = scanner.nextInt();
                    }
                    System.out.print("Введите искомое число: ");
                    int target = scanner.nextInt();
                    System.out.println("Результат: " + FunctionGoogleCS.findLast(arr16, target));
//                    System.out.println("Результат: " + function.findLast(arr16, target));

                    break;

                case 17:
                    System.out.println("Вставляет ваше число в вашу позицию в вашем массиве.");
                    System.out.print("Введите размер массива: ");
                    int size17 = scanner.nextInt();
                    int[] arr17 = new int[size17];
                    System.out.println("Введите элементы массива:");
                    for (int i = 0; i < size17; i++) {
                        arr17[i] = scanner.nextInt();
                    }
                    System.out.print("Введите число и позицию: ");
                    int num17 = scanner.nextInt();
                    int pos = scanner.nextInt();
                    try {
                        int[] result = FunctionGoogleCS.add(arr17, num17, pos);
                        System.out.print("Результат: ");
                        for (int value : result) {
                            System.out.print(value + " ");
                        }
                        System.out.println();
                    } catch (IllegalArgumentException e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;

                case 18:
                    System.out.println("Вы придумываете массив, а потом его разворачивает. Это остаётся всё тот же массив.");
                    System.out.print("Введите размер массива: ");
                    int size18 = scanner.nextInt();
                    int[] arr18 = new int[size18];
                    System.out.println("Введите элементы массива:");
                    for (int i = 0; i < size18; i++) {
                        arr18[i] = scanner.nextInt();
                    }
                    function.reverse(arr18);
                    System.out.print("Результат: ");
                    for (int value : arr18) {
                        System.out.print(value + " ");
                    }
                    System.out.println();
                    break;

                case 19:
                    System.out.println("Делает один массив из двух.");
                    System.out.print("Введите размер первого массива: ");
                    int size19a = scanner.nextInt();
                    int[] arr19a = new int[size19a];
                    System.out.println("Введите элементы первого массива:");
                    for (int i = 0; i < size19a; i++) {
                        arr19a[i] = scanner.nextInt();
                    }
                    System.out.print("Введите размер второго массива: ");
                    int size19b = scanner.nextInt();
                    int[] arr19b = new int[size19b];
                    System.out.println("Введите элементы второго массива:");
                    for (int i = 0; i < size19b; i++) {
                        arr19b[i] = scanner.nextInt();
                    }
                    int[] concatResult = function.concat(arr19a, arr19b);
                    System.out.print("Результат: ");
                    for (int value : concatResult) {
                        System.out.print(value + " ");
                    }
                    System.out.println();
                    break;

                case 20:
                    System.out.println("Придумываете любой массив, а потом он такой прикольный только теперь без отрицательных.");
                    System.out.print("Введите размер массива: ");
                    int size20 = scanner.nextInt();
                    int[] arr20 = new int[size20];
                    System.out.println("Введите элементы массива:");
                    for (int i = 0; i < size20; i++) {
                        arr20[i] = scanner.nextInt();
                    }
                    int[] filtered = function.deleteNegative(arr20);
                    System.out.print("Результат: ");
                    for (int value : filtered) {
                        System.out.print(value + " ");
                    }
                    System.out.println();
                    break;

                default:
                    System.out.println("Неверный выбор!");
            }
        }
    }
}

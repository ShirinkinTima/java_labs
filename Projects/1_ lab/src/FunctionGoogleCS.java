import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FunctionGoogleCS {
    public int sumLastNums(int x) {
        if (x < 10 && x > -10) {
            System.out.println("Error");
            return -1;
        }
        int newX = x;
        int d1 = newX % 10;
        newX = newX / 10;
        int d2 = newX % 10;
        return d1 + d2;
    }

    public boolean isPositive(int x) {
        return x > 0;
    }

    public boolean isUpperCase(char x) {
        String s = "ABCDEFGHIGKLMNOPQRSTUVWXYZ";
        char c;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (x == c) {
                return true;
            }
        }
        return false;
    }

    public boolean isDivisor(int a, int b) {
        boolean b1 = a % b == 0 || b % a == 0;
        return b1;
    }

    public int lastNumSum(int a, int b) {
        return ((a % 10) + (b % 10));
    }

    public double safeDiv(int x, int y) {
        if (y == 0) {
            return 0;
        } else {
            return (double) x / y;
        }
    }

    public String makeDecision(int x, int y) {
        if (x < y) {
            return  x + " < " + y ;
        } else if (x == y) {
            return x + " == " + y;
        } else {
            return x + " > " + y;
        }
    }

    public boolean sum3(int x, int y, int z) {
        if (x == y + z || y == x + z || z == x + y) {
            return true;
        } else {
            return false;
        }
    }

    public String age(int x) {
        String s;
        if (x % 10 == 1 && x != 11) {
            s = x + " год";
        } else if ((x % 10 == 2 || x % 10 == 3 || x % 10 == 4) && x != 12 && x != 13 && x != 14) {
            s = x + " года";
        } else {
            s = x + " лет";
        }
        return s;
    }

    public void printDays(String x) {
        switch (x) {
            case "понедельник":
                System.out.println("понедельник");
            case "вторник":
                System.out.println("вторник");
            case "среда":
                System.out.println("среда");
            case "четверг":
                System.out.println("четверг");
            case "пятница":
                System.out.println("пятница");
            case "суббота":
                System.out.println("суббота");
            case "воскресенье":
                System.out.println("воскресенье");
                break;
            default:
                System.out.println("это не день недели.");
        }
    }

    public String reverseListNums(int x) {
        StringBuilder result = new StringBuilder();
        for (int i = x; i >= 0; i--) {
            result.append(i);
            if (i > 0) {
                result.append(" ");
            }
        }
        return result.toString();
    }

    public int pow(int x, int y) {
        int result = x;
        for (int i = 0; i < y; i++) {
            result = result * x;
        }
        return result;
    }

    public boolean equalNum(int x) {
        int newX = x; // не портим исходный Х
        int sign = newX % 10;
        newX = newX / 10;
        int lenX = String.valueOf(Math.abs(newX)).length();
        for (int i = 0; i < lenX; i++) {
            if (newX % 10 != sign) {
                return false;
            }
            newX = newX / 10;
        }
        return true;
    }

    public void leftTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            System.out.println("*".repeat(i).trim());
        }
    }

    public void guessGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomRemember = random.nextInt(0, 10);
        int guessPlayer;
        int count = 0;
        System.out.println("Введите число от 0 до 9: ");
        do {
            guessPlayer = scanner.nextInt();
            count++;
            if (guessPlayer != randomRemember) {
                System.out.println("Вы не угадали, введите число от 0 до 9: ");
            } else {
                System.out.println("Вы угадали! Количество попыток: " + count);
                return;
            }
        } while (true);
    }

    public static int findLast(int[] arr, int x) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static int[] add(int[] arr, int x, int pos) {
        // Check
        if (pos < 0 || pos > arr.length) {
            throw new IllegalArgumentException("Позиция должна быть в диапазоне [0, " + arr.length + "]");
        }
        // Copy
        int[] newArray = new int[arr.length + 1];
        for (int i = 0; i < pos; i++) {
            newArray[i] = arr[i];
        }
        // Add
        newArray[pos] = x;
        // Copy
        for (int i = pos; i < arr.length; i++) {
            newArray[i + 1] = arr[i];
        }
        // ;)
        return newArray;
    }

    public void reverse(int[] arr) {
        int[] newArray = new int[arr.length];
        int c = 0;
        for (int i = arr.length - 1; i > 0; i--) {
            newArray[c] = arr[i];
            c++;
        }
        System.arraycopy(newArray, 0, arr, 0, arr.length); // это IDEА предлдожила.
        newArray = null; // типа почистили
    }

    public int[] concat(int[] arr1, int[] arr2) {
        int newArrayLength = arr1.length + arr2.length;
        int[] newArray = new int[newArrayLength];
        System.arraycopy(arr1, 0, newArray, 0, arr1.length);
        System.arraycopy(arr2, 0, newArray, arr1.length, arr2.length);
        return newArray;
    }

    public int[] deleteNegative(int[] arr) {
        int newArrayLength = 0;
        for (int element : arr) {
            if (element > 0) {
                newArrayLength++;
            }
        }
        int[] newArray = new int[newArrayLength];
        int index = 0;
        for (int element : arr) {
            if (element >= 0) {
                newArray[index] = element;
                index++;
            }
        }
        return newArray;
    }
}

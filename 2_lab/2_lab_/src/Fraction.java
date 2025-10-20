public class Fraction {
    private int numerator;
    private int denominator;

    // Конструкторы
    public Fraction(int numerator, int denominator) {
        setNumerator(numerator);
        setDenominator(denominator);
    }

    public Fraction(int numerator) {
        setNumerator(numerator);
        this.denominator = 1;
    }

    // Свойства
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        if (denominator == 0) {
            System.out.println("Делитель ноль! :`(");
            throw new RuntimeException();
        }
        this.denominator = denominator;
    }

    public int getNumerator() {
        return this.numerator;
    }

    public int getDenominator() {
        return this.denominator;
    }

    // Нахождение наибольшего общего делителя (НОД)
    private int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        int temp;
        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Сокращение дроби
    private Fraction simplify() {
        int gcd = gcd(numerator, denominator);
        int simplifiedNumerator = numerator / gcd;
        int simplifiedDenominator = denominator / gcd;

        // Убедимся, что знак находится в числителе
        if (simplifiedDenominator < 0) {
            simplifiedNumerator = -simplifiedNumerator;
            simplifiedDenominator = -simplifiedDenominator;
        }

        return new Fraction(simplifiedNumerator, simplifiedDenominator);
    }

    // Сложение с другой дробью
    public Fraction add(Fraction other) {
        int commonDenominator = this.denominator * other.denominator;
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        return new Fraction(newNumerator, commonDenominator).simplify();
    }

    // Сложение с целым числом
    public Fraction add(int number) {
        return add(new Fraction(number));
    }

    // Вычитание другой дроби
    public Fraction subtract(Fraction other) {
        int commonDenominator = this.denominator * other.denominator;
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        return new Fraction(newNumerator, commonDenominator).simplify();
    }

    // Вычитание целого числа
    public Fraction subtract(int number) {
        return subtract(new Fraction(number));
    }

    // Умножение на другую дробь
    public Fraction multiply(Fraction other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator).simplify();
    }

    // Умножение на целое число
    public Fraction multiply(int number) {
        return multiply(new Fraction(number));
    }

    // Деление на другую дробь
    public Fraction divide(Fraction other) {
        if (other.numerator == 0) {
            throw new ArithmeticException("Деление на ноль!");
        }
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        return new Fraction(newNumerator, newDenominator).simplify();
    }

    // Деление на целое число
    public Fraction divide(int number) {
        if (number == 0) {
            throw new ArithmeticException("Деление на ноль!");
        }
        return divide(new Fraction(number));
    }

    @Override
    public String toString() {
        if (numerator < 0 && denominator < 0) {
            numerator *= -1;
            denominator *= -1;
        }
        String string = numerator + "/" + denominator;
        return string;
    }
}
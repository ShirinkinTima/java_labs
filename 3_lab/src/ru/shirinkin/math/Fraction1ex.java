package ru.shirinkin.math;

public class Fraction1ex {
    private final int numerator;
    private final int denominator;

    // Конструкторы
    public Fraction1ex(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть нулем!");
        }

        // Обработка отрицательных значений
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }

        // Сокращение дроби при создании
        int gcd = gcd(Math.abs(numerator), Math.abs(denominator));
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
    }

    public Fraction1ex(int numerator) {
        this(numerator, 1);
    }

    // Геттеры
    public int getNumerator() {
        return this.numerator;
    }

    public int getDenominator() {
        return this.denominator;
    }

    // Нахождение наибольшего общего делителя (НОД)
    private int gcd(int a, int b) {
        int temp;
        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Сложение с другой дробью
    public Fraction1ex add(Fraction1ex other) {
        int commonDenominator = this.denominator * other.denominator;
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        return new Fraction1ex(newNumerator, commonDenominator);
    }

    // Сложение с целым числом
    public Fraction1ex add(int number) {
        return add(new Fraction1ex(number));
    }

    // Вычитание другой дроби
    public Fraction1ex subtract(Fraction1ex other) {
        int commonDenominator = this.denominator * other.denominator;
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        return new Fraction1ex(newNumerator, commonDenominator);
    }

    // Вычитание целого числа
    public Fraction1ex subtract(int number) {
        return subtract(new Fraction1ex(number));
    }

    // Умножение на другую дробь
    public Fraction1ex multiply(Fraction1ex other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction1ex(newNumerator, newDenominator);
    }

    // Умножение на целое число
    public Fraction1ex multiply(int number) {
        return multiply(new Fraction1ex(number));
    }

    // Деление на другую дробь
    public Fraction1ex divide(Fraction1ex other) {
        if (other.numerator == 0) {
            throw new ArithmeticException("Деление на ноль!");
        }
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        return new Fraction1ex(newNumerator, newDenominator);
    }

    // Деление на целое число
    public Fraction1ex divide(int number) {
        if (number == 0) {
            throw new ArithmeticException("Деление на ноль!");
        }
        return divide(new Fraction1ex(number));
    }

    @Override
    public String toString() {
        if (denominator == 1) {
            return String.valueOf(numerator);
        }
        return numerator + "/" + denominator;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Fraction1ex fraction = (Fraction1ex) obj;
        return numerator == fraction.numerator && denominator == fraction.denominator;
    }

    @Override
    public int hashCode() {
        return 31 * numerator + denominator;
    }
}
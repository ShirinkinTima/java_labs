package ru.shirinkin.math;

import java.util.Arrays;
import java.util.List;

public class SimpleSum {
    // Метод для сложения набора числовых значений
    public static double sum(double... numbers) {
        double sum = 0.0;
        for (Number num : numbers) {
            sum += num.doubleValue();
        }
        return sum;
    }
}
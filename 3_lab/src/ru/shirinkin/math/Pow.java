package ru.shirinkin.math;

import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;

public class Pow {
        public static double powCustom(String xStr, String yStr) {
            return pow(parseInt(xStr), parseInt(yStr));
        }
}

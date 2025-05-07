package main.java;

public class Division {
    public double divide(double a, double b) {
        if (Double.isNaN(a) || Double.isNaN(b)) {
            throw new IllegalArgumentException("Too oruulalt buruu baina.");
        }

        if (b == 0) {
            throw new IllegalArgumentException("Тэгээр хувааж болохгүй.");
        }

        return a / b;
    }
}

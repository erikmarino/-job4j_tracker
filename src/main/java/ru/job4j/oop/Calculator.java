package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int z) {
        return z - x;
    }

    public int divide(int b) {
        return b / x;
    }

    public int sumAllOperation(int result, int rsl, int resz, int rsldel) {
        return result + rsl + resz + rsldel;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static void main(String[] args) {
        int result = sum(10);
        System.out.println("Результат метода sum: " + result);

        Calculator calculator = new Calculator();
        int rsl = calculator.multiply(5);
        System.out.println("Результат метода multiply: " + rsl);

        int resz = minus(13);
        System.out.println("Результат метода minus: " + resz);

        Calculator del = new Calculator();
        int rsldel = calculator.divide(50);
        System.out.println("Результат метода divide: " + rsldel);

        Calculator summa = new Calculator();
        int rslsum = calculator.sumAllOperation(result, rsl, resz, rsldel);
        System.out.println("Результат метода sumAllOperation: " + rslsum);
    }
}

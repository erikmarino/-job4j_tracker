package ru.job4j.oop;

public class Max {

    public int add(int a, int b) {
        return a > b ? a : b;
    }

    public int add(int a, int b, int c) {
        return add(a, add(b, c));
    }

    public int add(int a, int b, int c, int d) {
        return add(a, b, add(c, d));
    }

}

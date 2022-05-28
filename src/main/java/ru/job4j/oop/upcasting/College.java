package ru.job4j.oop.upcasting;

import ru.job4j.oop.Student;

public class College {
    public static void main(String[] args) {
        Freshman freshman = new Freshman();
        Student fr = freshman;
        Object obj = freshman;
    }
}

package ru.job4j.oop;

public class Student {
    public void music() {
        System.out.println("Tra tra tra");
    }

    public void song() {
        System.out.println("I believe I can fly");
    }

    /**
     * В методе main создали объект класса Student, присвоили имя petya
     * вызвали метод music, использую переменную petya объекта класса Student
     */
    public static void main(String[] agrs) {
        Student petya = new Student();
        petya.music();
        petya.music();
        petya.music();
        petya.song();
        petya.song();
        petya.song();
    }
}

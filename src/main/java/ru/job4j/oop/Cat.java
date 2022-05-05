package ru.job4j.oop;

public class Cat {
    /**
     * Объявляем метод sound типа String
     * внутри метода создаём переменную voice типа String
     */
    public String sound() {
        String voice = "may-may";
        return voice;
    }

    public static void main(String[] args) {
        Cat peppy = new Cat();
        String say = peppy.sound();
        System.out.println("Peppy says: " + say);
    }
}

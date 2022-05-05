package ru.job4j.oop;

public class Student {
    /**
     *
     * @param lirics это входящий параметр типа String в методе music
     */
    public void music(String lirics) {
        System.out.println("I can sing a song: " + lirics);
    }

    /**
     * В методе main создали объект класса Student, присвоили имя petya
     * вызвали метод music, использую переменную petya объекта класса Student
     */
    public static void main(String[] agrs) {
        Student petya = new Student();
        String song = "I believe, i can fly";
        petya.music(song);
    }
}

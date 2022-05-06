package ru.job4j.oop;

/**
 * 1. Создайте класс ru.job4j.oop.DummyDic.
 * 2. Создайте в нем метод public String engToRus(String eng).
 * 3. Метод должен вернуть строчку "Неизвестное слово. " + eng.
 */

public class DummyDic {
    public String engToRus(String eng) {
        return "Неизвестное слово." + eng;
    }

    public static void main(String[] agrs) {
        DummyDic word = new DummyDic();
        String voice = word.engToRus(" Абракадабра");
        System.out.println(voice);
    }
}

package ru.job4j.oop;

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

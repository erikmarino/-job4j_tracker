package ru.job4j.oop;

public class Jukebox {
    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        }
        else if (position == 2) {
            System.out.println("Спокойной ночи");
        }
        else {
            System.out.println("Песня не найдена");
        }

    }

    public static void main(String[] agrs) {
        Jukebox song = new Jukebox();
        int one = 1;
        int two = 2;
        int tree = 3;
        song.music(one);
        song.music(two);
        song.music(tree);
    }
}

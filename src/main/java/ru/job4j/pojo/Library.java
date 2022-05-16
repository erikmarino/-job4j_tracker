package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book game = new Book("Game", 99);
        Book code = new Book("Clean code", 244);
        Book lost = new Book("Lost", 199);
        Book save = new Book("Save my life", 500);
        Book[] books = new Book[4];
        books[0] = game;
        books[1] = code;
        books[2] = lost;
        books[3] = save;
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getTitle() + " - " + bk.getPages());
        }
        System.out.println("--- Rearrange [0] whis [3] ---");
        Book tmp = books[0];
        books[0] = books[3];
        books[3] = tmp;
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getTitle() + " - " + bk.getPages());
        }
        System.out.println("--- Book search: Clean code ---");
        for (int index = 0; index < books.length; index++) {
             if (books[index] == code) {
                 Book bk = books[index];
                 System.out.println(bk.getTitle() + " - " + bk.getPages());
             }
        }
    }
}

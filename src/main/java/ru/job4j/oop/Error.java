package ru.job4j.oop;

/**
 * 1. Создайте класс Error, определите в нем три поля: boolean active, int status, String message;
 * 2. Добавьте в этом классе 2 конструктора: явный конструктор по умолчанию, конструктор с тремя параметрами,
 * который будет инициализировать поля переданными значениями;
 * 3. По аналогии с описанием добавьте метод, который будет выводить в консоль содержимое полей;
 * 4. Добавьте метод main(), в котором будете создавать объект с помощью явного конструктора по умолчанию,
 * а также несколько объектов с помощью конструктора с параметрами. Вызовите на созданных объектах метод, д
 * обавленный в пункте 3;
 */

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printError() {
        System.out.println("Сеть " + active);
        System.out.println("Ошибка : " + status);
        System.out.println("Статус интернета: " + message);
    }

    public static void main(String[] args) {
        Error error = new Error();
        error.printError();
        Error err = new Error(true, 404, "нет подключения к интернету");
        err.printError();
    }

}

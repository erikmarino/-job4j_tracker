package ru.job4j.tracker;

public class Item {
    private int id;
    private String name;

    public Item() {
    }

    public Item(String name) {
        this.name = name;
    }

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printInfo() {
        System.out.println(id);
        System.out.println(name);
    }

    public static void main(String[] args) {
        Item tempOne = new Item();
        tempOne.printInfo();
        Item tempTwo = new Item("Kate");
        tempTwo.printInfo();
        Item tempTree = new Item(13, "Stive");
        tempTree.printInfo();
    }
}
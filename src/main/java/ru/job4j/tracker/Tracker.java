package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        Item[] whenNoNull = new Item[size];
        int count = 0;
        for (int index = 0; index < size; index++) {
            if (items[index] != null) {
                whenNoNull[count++] = items[index];
            }
        }
         return Arrays.copyOf(whenNoNull, count);
    }

    public Item[] findByName(String key) {
        Item[] whenName = new Item[size];
        int count = 0;
        for (int index = 0; index < size; index++) {
            if (key.equals(items[index].getName())) {
                whenName[count++] = items[index];
            }
        }
        return Arrays.copyOf(whenName, count);
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}
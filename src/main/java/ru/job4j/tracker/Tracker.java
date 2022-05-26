package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    /**
     * добавляет заявку, переданную в аргументах в массив заявок items.
     *
     * @return
     */
    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    /**
     * возвращает копию массива items без null элементов (без пустых ячеек)
     *
     * @return
     */
    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    /**
     * проверяет в цикле все элементы массива items, сравнивая name (используя метод getName класса Item)
     * с аргументом метода String key. Элементы, у которых совпадает name, копирует в результирующий массив
     * и возвращает его.
     *
     * @param key
     * @return
     */
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

    /**
     * проверяет в цикле все элементы массива items, сравнивая id с аргументом int id
     * и возвращает найденный Item. Если Item не найден - возвращает null.
     *
     * @param id
     * @return
     */
    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    /**
     * метод, который будет возвращать index по id.
     *
     * @param id
     * @return
     */
    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            items[index] = item;
            item.setId(id);
        }
        return rsl;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            System.arraycopy(items, index + 1, items, index, size - index - 1);
            items[size - 1] = null;
            size--;
        }
        return rsl;
    }
}
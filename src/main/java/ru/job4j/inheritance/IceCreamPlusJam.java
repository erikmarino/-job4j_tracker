package ru.job4j.inheritance;

import ru.job4j.inheritance.IceCream;

public class IceCreamPlusJam extends IceCream {
    private static final int JAM_PRICE = 50;

    public IceCreamPlusJam(int weight) {
        super(weight);
    }

    public int price() {
        return JAM_PRICE + super.price();
    }
}

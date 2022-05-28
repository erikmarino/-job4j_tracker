package ru.job4j.oop.vehicle;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " двигается по скоростным трассам.");
    }

    @Override
    public void fuel() {
        System.out.println(getClass().getSimpleName() + " заправляется бензином.");
    }
}

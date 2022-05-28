package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Вызов drive");
    }

    @Override
    public void passengers(int numPas) {
        System.out.println("Количество пассажиров: " + numPas);
    }

    @Override
    public double refuel(double numRef) {
        double price  = 50.4 * numRef;
        System.out.print("Заправился на: ");
        System.out.printf("%.2f", price);
        return price;
    }
}

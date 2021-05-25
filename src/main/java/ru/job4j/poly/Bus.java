package ru.job4j.poly;

import ru.job4j.tracker.Transport;

public class Bus implements Transport {
    @Override
    public void goAuto() {
        System.out.println("Авто поехало");
    }

    @Override
    public void passengers(int num) {
        System.out.println("Пассажиров в транспорте" + num);
    }

    @Override
    public int refuel(int fuel) {
        System.out.println("Заправленно топлива" + fuel);
        return fuel * 70;
    }
}

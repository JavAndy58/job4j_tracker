package ru.job4j.transport;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println("Автобус передвигается по автодорогам");
    }
}

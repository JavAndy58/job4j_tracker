package ru.job4j.transport;

public class Atrain implements Vehicle{
    @Override
    public void move() {
        System.out.println("Поезд передвигается по железной дороге");
    }
}

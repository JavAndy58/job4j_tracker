package ru.job4j.transport;

public class Plane implements Vehicle{
    private int speed = 350;
    @Override
    public void move(){
        System.out.println("Самолет передвигается по воздуху");
    }
}

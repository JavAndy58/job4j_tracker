package ru.job4j.transport;

public class Travel {
    public static void main(String[] args) {
        Vehicle plane = new Plane();
        Vehicle atrain = new Atrain();
        Vehicle bus = new Bus();
        Vehicle[] vehicles = new Vehicle[]{plane, atrain, bus};
        for (Vehicle vehicle : vehicles) {
            vehicle.move();
        }
    }
}

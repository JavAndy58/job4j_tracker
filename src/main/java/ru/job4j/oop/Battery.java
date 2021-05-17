package ru.job4j.oop;

public class Battery {

    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public void exchange(Battery another) {
        another.load = another.load + this.load;
        this.load = 0;
    }

    public void showBattery() {
        System.out.println(load);
    }

    public static void main(String[] args) {
        Battery battery1 = new Battery(100);
        Battery battery2 = new Battery(50);
        battery1.exchange(battery2);
        battery1.showBattery();
        battery2.showBattery();
    }
}

package ru.job4j.stream;

public class Auto {
    private String brand;
    private String model;
    private short speed;
    private byte capacity;
    private String color;

    @Override
    public String toString() {
        return "Auto{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", speed=" + speed +
                ", capacity=" + capacity +
                ", color='" + color + '\'' +
                '}';
    }

    static class Builder {
        private String brand;
        private String model;
        private short speed;
        private byte capacity;
        private String color;


        Builder buildBrand(String brand) {
            this.brand = brand;
            return this;
        }

        Builder buildModel(String model) {
            this.model = model;
            return this;
        }

        Builder buildSpeed(short speed) {
            this.speed = speed;
            return this;
        }

        Builder buildCapacity(byte capacity) {
            this.capacity = capacity;
            return this;
        }

        Builder buildColor(String color) {
            this.color = color;
            return this;
        }

        Auto build() {
            Auto auto = new Auto();
            auto.brand = brand;
            auto.model = model;
            auto.speed = speed;
            auto.capacity = capacity;
            auto.color = color;
            return auto;
        }
    }

    public static void main(String[] args) {
        Auto auto = new Builder().buildBrand("brand")
                .buildModel("model")
                .buildSpeed((short) 250)
                .buildCapacity((byte) 5)
                .buildColor("red")
                .build();
        System.out.println(auto);
    }
}


package ru.job4j.oop;

import java.sql.SQLOutput;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {
    private int x;
    private int y;
    private int z;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public void info() {
        System.out.println("Point[" + this.x + ", " + this.y + "]");
    }

    public double distance3d(Point that) {
        return Math.sqrt(Math.pow(that.x - this.x, 2) + Math.pow(that.y - this.y, 2)
                + Math.pow(that.z - this.z, 2));
    }

    public static void main(String[] args) {
        Point point1 = new Point(0, 0, 0);
        Point point2 = new Point(5, 0, 0);
        System.out.println(point1.distance3d(point2));
    }
}

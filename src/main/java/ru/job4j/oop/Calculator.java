package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return x - y;
    }

    int multiply(int a) {
        return x * a;
    }

    int divide(int y) {
        return y / x;
    }

    int sumAllOperation(int y) {
        return sum(y) + multiply(y) + minus(y) + divide(y);
    }

    public static void main(String[] args) {
        System.out.println(sum(10));
        System.out.println(minus(10));
        Calculator calculator = new Calculator();
        System.out.println(calculator.multiply(15));
        System.out.println(calculator.divide(20));
        System.out.println(calculator.sumAllOperation(10));
    }
}

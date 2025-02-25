package ru.job4j.ex;

public class Fact {
    public static void main(String[] args) {
        Fact fact = new Fact();
        System.out.println("Факториал числа - 10 " + fact.calc(-5) + ": ");
    }

    public int calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Должно быть положительное число");
        }
        int rsl = 1;
        for (int index = 1; index <= n; index++) {
            rsl *= index;
        }
        return rsl;
    }
}

package ru.job4j.io;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Привет!. Как тя зовут?");
        String name = input.nextLine();
        System.out.println(name + " , рады Вас видеть");
    }
}

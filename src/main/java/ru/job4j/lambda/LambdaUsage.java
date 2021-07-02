package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaUsage {

    public static void main(String[] args) {
        Comparator<String> cmpText = (left, right) -> {
            System.out.println("compareTo - " + right + " : " + left);
            return right.compareTo(left);
        };
    }
}

package ru.job4j.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Article {
    public static boolean generateBy(String origin, String line) {
        boolean rsl = false;
        String[] originArray = origin.split("\\s");
        String[] lineArray = line.split("\\s");
        HashSet<String> originSet = new HashSet<>(Arrays.asList(originArray));
        for (String s : lineArray) {

            if (!originSet.add(s)) {
                rsl = false;
                break;
            }
            rsl = true;
        }
        return rsl;
    }

    public static void main(String[] args) {
        String str = "Мама мыла раму и окно";
        String[] strArray = str.split(" ");
        HashSet<String> strSet = new HashSet<>(Arrays.asList(strArray));

        for(String i : strSet) {
            System.out.print(i + " ");
        }
    }
}

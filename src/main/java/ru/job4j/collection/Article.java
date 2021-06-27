package ru.job4j.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Article {
    public static boolean generateBy(String origin, String line) {
        boolean rsl = true;
        String[] originArray = origin.split("\\b");
        String[] lineArray = line.split("\\b");
        Set<String> originSet = new HashSet<>(Arrays.asList(originArray));
        for (String s : lineArray) {
            if (originSet.add(s)) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}

package ru.job4j.collection;

import java.util.*;

public class FreezeStr {
    public static boolean eq(String left, String right) {
        boolean rslTemp = false;
        char[] leftChar = left.toCharArray();
        char[] rightChar = right.toCharArray();
        Map<Character, Integer> leftMap = new HashMap<>();
        for (char element : leftChar) {
            int rsl = 1;
            if (!leftMap.containsKey(element)) {
                leftMap.put(element, rsl);
            } else if (leftMap.containsKey(element)) {
                leftMap.put(element, leftMap.get(element) + 1);
            }
        }
        for (char element : rightChar) {
            if (!leftMap.containsKey(element)) {
                rslTemp = false;
                break;
            }
            int rsl = leftMap.get(element);
            if (leftMap.containsKey(element)) {
                 leftMap.put(element, rsl - 1);
            }
        }
        int rsl = 0;
        for (Character element : leftMap.keySet()) {
            Integer value = leftMap.get(element);
            rsl = +value;
        }
        rslTemp = rsl == 0;
        return rslTemp;
    }
}
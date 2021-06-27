package ru.job4j.collection;

import java.util.*;

public class FreezeStr {
    public static boolean eq(String left, String right) {
        char[] leftChar = left.toCharArray();
        char[] rightChar = right.toCharArray();
        Map<Character, Integer> leftMap = new HashMap<>();
        for (char element : leftChar) {
            int rsl = 0;
            if (!leftMap.containsKey(element)) {
                leftMap.put(element, rsl + 1);
            } else if (leftMap.containsKey(element)) {
                leftMap.put(element, leftMap.get(element) + 1);
            }
        }
        for (char element : rightChar) {
            if (!leftMap.containsKey(element)) {
                break;
            }
            if (leftMap.get(element) == 1) {
                leftMap.remove(element);
            }
            if (leftMap.containsKey(element)) {
                 leftMap.put(element, leftMap.get(element) - 1);
            }
        }
        return leftMap.isEmpty();
    }
}
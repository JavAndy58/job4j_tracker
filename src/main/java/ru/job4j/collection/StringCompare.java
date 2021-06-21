package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        char[] leftChars = left.toCharArray();
        char[] rightChar = right.toCharArray();
        for (int index = 0; index < Math.min(left.length(), right.length()); index++) {
            int rslTemp = Character.compare(leftChars[index], rightChar[index]);
            if (rslTemp != 0) {
                return rslTemp;
            }
        }
        return Integer.compare(left.length(), right.length());
    }
}

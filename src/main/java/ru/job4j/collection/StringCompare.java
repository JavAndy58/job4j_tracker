package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String>{
    @Override
    public int compare(String left, String right) {
        int rsl = 0;
            for (int index = 0; index < Math.min(left.length(), right.length()); index++) {
                int rslTemp = Integer.compare(left.charAt(index), right.charAt(index));
                if (rslTemp > 0) {
                    rsl = +1;
                    break;
                } else if (rslTemp < 0) {
                    rsl = -1;
                    break;
                } else {
                    if (left.length() == right.length()) {
                        rsl = 0;
                    } else if (left.length() > right.length()) {
                        rsl = +1;
                    } else {
                        rsl = -1;
                    }
                }
            }
        return rsl;
    }
}

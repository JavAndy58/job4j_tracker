package ru.job4j.collection;

import java.util.Comparator;

import static java.lang.Integer.parseInt;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] leftSplit = left.split(". ");
        int leftInt = parseInt(leftSplit[0]);
        String[] rightSplit = right.split(". ");
        int rightInt = parseInt(rightSplit[0]);
        return Integer.compare(leftInt, rightInt);
    }
}

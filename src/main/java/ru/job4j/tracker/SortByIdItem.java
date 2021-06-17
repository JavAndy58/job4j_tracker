package ru.job4j.tracker;

import java.util.Collections;
import java.util.Arrays;
import java.util.List;

public class SortByIdItem {
    public static void main(String[] args) {
        List<Item> items = Arrays.asList(
                new Item(1, "aaaa"),
                new Item(4, "dddd"),
                new Item(3, "cccc")
        );
        System.out.println(items);
        Collections.sort(items);
        System.out.println(items);
        Collections.sort(items, new SortByIdWaningItem());
        System.out.println(items);
    }
}

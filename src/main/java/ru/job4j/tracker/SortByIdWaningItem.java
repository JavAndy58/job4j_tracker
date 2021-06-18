package ru.job4j.tracker;

import java.util.Comparator;

public class SortByIdWaningItem implements Comparator<Item> {

    @Override
    public int compare(Item first, Item second) {
        Integer GetFirst = first.getId();
        Integer GetSecond = second.getId();
        return GetSecond.compareTo(GetFirst);
    }
}

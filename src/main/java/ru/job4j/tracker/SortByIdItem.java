package ru.job4j.tracker;

import java.util.Collections;
import java.util.Arrays;
import java.util.List;

public class SortByIdItem {
    public void sortId (List<Item> list) {
        Collections.sort(list);
    }

    public void sortIdDown (List<Item> list) {
        Collections.sort(list, new SortByIdWaningItem());
    }

//    public static void main(String[] args) {
//        SortByIdItem sortByIdItem = new SortByIdItem();
//        List<Item> items = Arrays.asList(
//                new Item(1, "aaaa"),
//                new Item(3, "cccc"),
//                new Item(2, "bbbb"),
//                new Item(4, "dddd")
//        );
//        System.out.println(items);
//        sortByIdItem.sortId(items);
//        System.out.println(items);
//        sortByIdItem.sortIdDown(items);
//        System.out.println(items);
//    }
}

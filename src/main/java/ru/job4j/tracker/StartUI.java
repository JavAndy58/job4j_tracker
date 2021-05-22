package ru.job4j.tracker;

import java.sql.SQLOutput;

public class StartUI {
    public static void main(String[] args) {
        Item item1 = new Item();
        Item item2 = new Item();
        Item item3 = new Item();
        Item item4 = new Item();
        Item item5 = new Item();
        item1.setName("aaaaa");
        item3.setName("bbbbb");
        item5.setName("cccccc");
        Tracker tracker = new Tracker();
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        tracker.add(item4);
        tracker.add(item5);
        Item[] result = tracker.findAll();
        System.out.println("Объекты после отсечения");
        for (int i = 0; i < result.length; i++) {
            Item temp = result[i];
            System.out.print(temp.getName() + " ");
        }
        System.out.println();
        Item[] result2 = tracker.findByName("cccccc");
        System.out.println("Объекты после поиска ключа");
        for (int i = 0; i < result2.length; i++) {
            Item temp = result2[i];
            if (temp.getName() != null) {
                System.out.println(temp.getName() + " ");
            }
        }
        System.out.println("Объект после поиска");
        Item i = tracker.findById(1);
        System.out.println(i.getName());
    }
}
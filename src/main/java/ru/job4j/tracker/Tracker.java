package ru.job4j.tracker;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll(Item[] items) {
        Item[] itemsWithoutNull = new Item[items.length];
        int size = 0;
        for (int i = 0; i < items.length; i++) {
            Item temp = items[i];
            if (temp != null) {
                itemsWithoutNull[size] = temp;
                size++;
            }
        }
        itemsWithoutNull = Arrays.copyOf(itemsWithoutNull, size);
        return itemsWithoutNull;
    }

    public Item[] findByName(String key) {
        Item[] itemsKey = new Item[items.length];
        int size = 0;
        for (int i = 0; i < items.length; i++) {
            Item temp = items[i];
            if (temp.getName() == key) {
                itemsKey[size] = temp;
                size++;
            }
        }
        itemsKey = Arrays.copyOf(itemsKey, size);
        return itemsKey;

    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}
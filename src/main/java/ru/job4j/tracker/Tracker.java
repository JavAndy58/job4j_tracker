package ru.job4j.tracker;



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

    public Item[] findAll() {
        Item[] itemsWithoutNull = new Item[items.length];
        int n = 0;
        for (int i = 0; i < size; i++) {
            Item temp = items[i];
            if (temp.getName() != null) {
                itemsWithoutNull[n] = temp;
                n++;
            }
        }
        return Arrays.copyOf(itemsWithoutNull, n);
    }

    public Item[] findByName(String key) {
        Item[] itemsKey = new Item[items.length];
        int n = 0;
        for (int i = 0; i < size; i++) {
            Item temp = items[i];
            if (key.equals(temp.getName())) {
                itemsKey[n] = temp;
                n++;
            }
        }
        return Arrays.copyOf(itemsKey, n);
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
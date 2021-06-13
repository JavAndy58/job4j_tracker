package ru.job4j.tracker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tracker {
//    private final Item[] items = new Item[100];
    private final List<Item> items = new ArrayList<>();
    private int ids = 1;
//    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
//        items[size++] = item;
        items.add(item);
        return item;
    }
    public List<Item> findAll() {
//        return Arrays.copyOf(items, size);
        return items;
    }

    public List<Item> findByName(String key) {
//        Item[] result = new Item[size];
//        int count = 0;
//        for (int i = 0; i < size; i++) {
//            Item item = items[i];
//            if (item.getName().equals(key)) {
//                result[count] = item;
//                count++;
//            }
        List<Item> result = new ArrayList<>();
        int count = 0;
        for (Item element : items) {
            if (element.getName().equals(key)) {
                result.add(count, element);
                count++;
            }
        }
//        return Arrays.copyOf(result, count);
        return result;
    }

    public Item findById(int id) {
//        int index = indexOf(id);
//        return index != - 1 ? items[index] : null;
        return id != -1 ? items.get(indexOf(id)) : null;
    }

    private int indexOf(int id) {
//        int rsl = -1;
//        for (int index = 0; index < size; index++) {
//            if (items[index].getId() == id) {
//                rsl = index;
//                break;
//            }
        int rsl = -1;
        for (Item item: items) {
            if (item.getId() == id) {
                rsl = items.indexOf(item);
                break;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
//        int index = indexOf(id);
//        boolean result = index != -1;
//        if (result) {
//            item.setId(id);
//            items[index] = item;
//        }
//        return result;
        int index = indexOf(id);
        boolean result = index != -1;
        if (result) {
            items.set(index, item);
        }
        return result;
    }
    public boolean delete(int id) {
//        int index = indexOf(id);
//        boolean result = index != -1;
//        if(result) {
//            System.arraycopy(items, index + 1, items, index, size - index - 1);
//            items[size - 1] = null;
//            size--;
//        }
//        return result;
//    }
        int index = indexOf(id);
        boolean result = index != -1;
        if (result) {
            items.remove(index);
        }
        return result;
    }
}
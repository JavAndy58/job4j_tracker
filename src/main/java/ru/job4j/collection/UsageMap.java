package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> maps= new HashMap<>();
        maps.put("java@mail.ru", "Иванов Иван Иванович");
        for (String key : maps.keySet()) {
            String value = maps.get(key);
            System.out.println(key + " = " + value);
        }
    }
}

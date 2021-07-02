package ru.job4j.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class SearchFolder {

    public static List<Folder> filter(List<Folder> list, Predicate<Folder> pred) {
        List<Folder> rsl = new ArrayList<>();
        for (Folder f : list) {
            if (pred.test(f)) {
                rsl.add(f);
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        List<Folder> folders = Arrays.asList(
                new Folder("fix", 110),
                new Folder("bug", 75),
                new Folder("bug", 90)
        );
        List<Folder> foldersSize = new ArrayList<>();
        foldersSize = SearchFolder.filter(folders, (f) -> f.getSize() > 100);
        System.out.println("Массив после поиска");
        for (Folder f : foldersSize) {
            System.out.println(f);
        }
        List<Folder> foldersName = new ArrayList<>();
        foldersName = SearchFolder.filter(folders, (Ff) -> Ff.getName().contains("bug"));
        System.out.println("Массив после поиска по имени");
        for (Folder f : foldersName) {
            System.out.println(f);
        }
    }
}
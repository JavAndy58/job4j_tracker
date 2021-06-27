package ru.job4j.collection;

import java.util.*;

public class Departments {
    public static List<String> input = Arrays.asList("K1/SK1", "K1/SK2", "K1/SK1/SSK1", "K1/SK1/SSK2"
                                  , "K2", "K2/SK1/SSK1", "K2/SK1/SSK2");

    public static List<String> fillGaps(List<String> deps) {
        Set<String> tmp = new LinkedHashSet<>();
        for (String value : deps) {
            String[] el = value.split("/");
            String start = "";
            for (String element : el) {
                tmp.add(start + element);
                start += element + "/";
            }
        }
        return new ArrayList<>(tmp);
    }

    public static void sortAsc(List<String> orgs) {
        Collections.sort(orgs);
    }

    public static void sortDesc(List<String> orgs) {
        Collections.sort(orgs, new DepDescComp().thenComparing(new DepAskComp()));
    }

    public static void main(String[] args) {
        List<String> output = fillGaps(input);
        for (String s : output) {
            System.out.print(s + " ");
        }
//        System.out.println("После сортировки");
//        sortAsc(output);
//        for (String s : output) {
//            System.out.print(s + " ");
//        }
        System.out.println("После обратной сортировки");
        sortDesc(output);
        for (String s : output) {
            System.out.print(s + " ");
        }
    }
}
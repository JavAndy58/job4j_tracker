package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

public class ConvertMatrix2List {
    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>();
        for (int[] row : array) {
            for (int cell : row) {
                list.add(cell);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[][] input = {
                {1, 2, 3},
                {4, 5, 6}
        };
        ConvertMatrix2List list = new ConvertMatrix2List();
        List<Integer> result = list.toList(input);
        for (Integer element : result) {
            System.out.print(element + " ");
        }
    }
}

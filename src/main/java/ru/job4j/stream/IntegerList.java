package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntegerList {

    public List<Integer> numbersToList(Integer[][] arrays) {
        return Arrays.stream(arrays)
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());
    }
}

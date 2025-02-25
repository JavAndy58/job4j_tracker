package ru.job4j.lambda;

import java.util.List;
import java.util.Optional;

public class OptionalOfAndEmpty {
    public static Optional<String> findValue(List<String> strings, String value) {
        Optional<String> result = strings.stream()
                .filter(str -> str.contains(value))
                                .findFirst();
        return result;
    }
}
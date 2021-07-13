package ru.job4j.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SchoolToMap {

    public Map<String,Student> collectMap(List<Student> students) {
        return students.stream()
                .collect(
                        Collectors.toMap(
                                Student::getSurname,
                                e -> e,
                                (e1, e2) -> e1
                        )
                );
    }

    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student(50, "One"),
                new Student(55, "Two"),
                new Student(60, "Two"),
                new Student(70, "Three")
        );
        SchoolToMap schoolToMap = new SchoolToMap();
        Map<String,Student> studentMap = schoolToMap.collectMap(students);
        studentMap.entrySet().forEach(System.out::println);
    }


}

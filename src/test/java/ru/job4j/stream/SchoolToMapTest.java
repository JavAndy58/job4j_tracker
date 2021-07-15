package ru.job4j.stream;

import org.junit.Test;
import java.util.*;
import java.util.ArrayList;
import java.util.function.Predicate;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SchoolToMapTest {

    @Test
    public void whenStudentsMap() {
        List<Student> students = List.of(
                new Student(50, "One"),
                new Student(55, "Two"),
                new Student(60, "Two"),
                new Student(70, "Three")
        );
        SchoolToMap schoolToMap = new SchoolToMap();
        Map<String,Student> studentMap = schoolToMap.collectMap(students);
        Map<String,Student> expected = new HashMap<>();
        expected.put("One", new Student(50, "One"));
        expected.put("Two", new Student(55, "Two"));
        expected.put("Three", new Student(70, "Three"));
        assertThat(studentMap, is(expected));
    }
}

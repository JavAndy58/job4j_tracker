package ru.job4j.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JobSorter {
    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Fix bug", 4),
                new Job("Fix bug", 2),
                new Job("X task", 0)
        );
        Collections.sort(jobs, new JobDescByName());
        System.out.println("Сортировка по имени, возрастание");
        System.out.println(jobs);
        Collections.sort(jobs, new JobDescByPriority());
        System.out.println("Сортировка по приоритетуб возрастание");
        System.out.println(jobs);
        System.out.println("Сортировка по имени, убывание");
        Collections.sort(jobs, new JobDescByNameBack());
        System.out.println(jobs);
        System.out.println("Сортировка по приоритету, убывание");
        Collections.sort(jobs, new JobDescByPriorityBack());
        System.out.println(jobs);
    }
}

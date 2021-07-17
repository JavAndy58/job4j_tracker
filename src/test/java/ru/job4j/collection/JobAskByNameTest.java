package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class JobAskByNameTest {

    @Test
    public void whenDescByNameBack() {
        List<Job> jobsActual = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Fix bug", 4),
                new Job("Fix bug", 2),
                new Job("X task", 0)
        );
        List<Job> jobsExpected = List.of(
                new Job("Fix bug", 1),
                new Job("Fix bug", 4),
                new Job("Fix bug", 2),
                new Job("X task", 0)
        );
        Collections.sort(jobsActual, new JobAscByName());
        assertThat(jobsActual, is(jobsExpected));
    }
}

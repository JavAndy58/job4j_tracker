package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class JobDescByNameTest {

    @Test
    public void whenDescByName() {
        List<Job> jobsActual = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Fix bug", 4),
                new Job("Fix bug", 2),
                new Job("X task", 0)
        );
        List<Job> jobsExpected = Arrays.asList(
                new Job("X task", 0),
                new Job("Fix bug", 1),
                new Job("Fix bug", 4),
                new Job("Fix bug", 2)
        );
        Collections.sort(jobsActual, new JobDescByName());
        assertThat(jobsActual, is(jobsExpected));
    }
}

package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SingleTrackerTest {

    @Test
    public void whenSingleTack() {
        SingleTracker singleTracker = SingleTracker.getInstance();
        SingleTracker singleTracker2 = SingleTracker.getInstance();
        assertThat(singleTracker, is (singleTracker2));
    }
}

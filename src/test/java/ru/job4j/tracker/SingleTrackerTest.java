package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

public class SingleTrackerTest {

    @Test
    public void whenSingleTrack() {
        SingleTracker singleTracker = SingleTracker.getInstance();
        SingleTracker singleTracker1 = SingleTracker.getInstance();
        assertThat(singleTracker.equals(singleTracker1), is(true));
    }

}
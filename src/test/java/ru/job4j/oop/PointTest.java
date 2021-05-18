package ru.job4j.oop;

import org.junit.Test;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

public class PointTest {

    @Test
    public void area() {
        Point point1 = new Point(0, 0, 0);
        Point point2 = new Point(5, 0, 0);

        double rsl = point1.distance3d(point2);
        assertThat(rsl, closeTo(5, 0.001));
    }
}
package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class DiapasonTest {

    @Test
    public void whenLinearFunctionThenLinearResults() {
        Diapason function = new Diapason();
        List<Double> result = function.diapason(5, 8, x -> x + 1);
        List<Double> expected = Arrays.asList(6D, 7D, 8D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenLinearFunctionThenQuadraticResults2() {
        Diapason function = new Diapason();
        List<Double> result = function.diapason(5, 8, x -> x * x);
        List<Double> expected = Arrays.asList(25D, 36D, 49D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenLinearFunctionThenIndicativeResults2() {
        Diapason function = new Diapason();
        List<Double> result = function.diapason(5, 8, x -> 3 * x);
        List<Double> expected = Arrays.asList(15D, 18D, 21D);
        assertThat(result, is(expected));
    }
}

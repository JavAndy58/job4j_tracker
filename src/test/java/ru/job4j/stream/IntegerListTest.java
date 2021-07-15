package ru.job4j.stream;


import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class IntegerListTest {

    @Test
    public void whenIntegerToList() {
        Integer[][] numbers = {
                {10, 9, 20},
                {100, 10, 50}
        };
        IntegerList integerList = new IntegerList();
        List<Integer> rsl = integerList.numbersToList(numbers);
        List<Integer> expected = List.of(10, 9, 20, 100, 10, 50);
        assertThat(rsl, is(expected));
    }
}

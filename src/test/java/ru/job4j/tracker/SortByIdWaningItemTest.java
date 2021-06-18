package ru.job4j.tracker;


import org.junit.Test;
import java.util.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import java.util.Collections;

public class SortByIdWaningItemTest {

    @Test
    public void whenSortId() {
        List<Item> itemsExpected = Arrays.asList(
                new Item(1, "aaaa"),
                new Item(2, "bbbb"),
                new Item(3, "cccc"),
                new Item(4, "dddd")
        );
        List<Item> itemsActual = Arrays.asList(
                new Item(1, "aaaa"),
                new Item(3, "cccc"),
                new Item(2, "bbbb"),
                new Item(4, "dddd")
        );

        Collections.sort(itemsActual);
        assertThat(itemsActual, is(itemsExpected));
    }

    @Test
    public void whenSortIdDown() {
        List<Item> itemsExpected = Arrays.asList(
                new Item(4, "dddd"),
                new Item(3, "cccc"),
                new Item(2, "bbbb"),
                new Item(1, "aaaa")
        );
        List<Item> itemsActual = Arrays.asList(
                new Item(1, "aaaa"),
                new Item(3, "cccc"),
                new Item(2, "bbbb"),
                new Item(4, "dddd")
        );
        Collections.sort(itemsActual, new SortByIdWaningItem());
        assertThat(itemsActual, is(itemsExpected));
    }

}
package ru.job4j.tracker;


import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SortByIdItemTest {

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
        SortByIdItem sortByIdItem = new SortByIdItem();
        sortByIdItem.sortId(itemsActual);
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
        SortByIdItem sortByIdItem = new SortByIdItem();
        sortByIdItem.sortIdDown(itemsActual);
        assertThat(itemsActual, is(itemsExpected));
    }

}
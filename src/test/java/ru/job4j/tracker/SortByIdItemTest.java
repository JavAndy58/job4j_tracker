package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.collection.FullSearch;
import static org.hamcrest.core.Is.is;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertThat;

public class SortByIdItemTest {
    @Test
    public void whenSortByIdItemTest() {
        SortByIdItem sortByIdItem = new SortByIdItem();
        List<Item> expected = Arrays.asList(
                new Item(1, "aaaa"),
                new Item(2, "bbbb"),
                new Item(3, "cccc"),
                new Item(4, "dddd")
        );
        List<Item> items = Arrays.asList(
                new Item(1, "aaaa"),
                new Item(4, "dddd"),
                new Item(3, "cccc"),
                new Item(2, "bbbb")
        );
        sortByIdItem.sortId(items);
        assertThat(expected, is(items));
    }
}

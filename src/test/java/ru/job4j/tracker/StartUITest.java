package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

public class StartUITest {

    @Test
    public void whenFindNameAction() {
        Output out = new StubOutput();
        MemTracker memTracker = new MemTracker();
        Item item = memTracker.add(new Item("Item Id"));
        String tempName = item.getName();
        Input in = new StubInput(
                new String[] {"0", tempName, "1"}
        );
        List<UserAction> actions = Arrays.asList(
                new FindNameAction(out),
                new Exit()
        );
        new StartUI(out).init(in, memTracker, actions);
        assertThat(out.toString(), is("Menu." + System.lineSeparator()
                + "0. Find items by name" + System.lineSeparator() + "1. Exit"
                + System.lineSeparator() + "=== Find items by name ==="
                + System.lineSeparator() + item + System.lineSeparator()
                + "Menu." + System.lineSeparator() + "0. Find items by name"
                + System.lineSeparator() + "1. Exit" + System.lineSeparator()));
    }

    @Test
    public void whenFindIdAction() {
        Output out = new StubOutput();
        MemTracker memTracker = new MemTracker();
        Item item = memTracker.add(new Item("Item Id"));
        String tempId = Integer.toString(item.getId());
        Input in = new StubInput(
                new String[] {"0", tempId, "1"}
        );
        List<UserAction> actions = Arrays.asList(
                new FindIdAction(out),
                new Exit()
        );
        new StartUI(out).init(in, memTracker, actions);
        assertThat(out.toString(), is("Menu." + System.lineSeparator()
                + "0. Find item by id" + System.lineSeparator() + "1. Exit"
                + System.lineSeparator() + "=== Find item by id==="
                + System.lineSeparator() + item + System.lineSeparator()
                + "Menu." + System.lineSeparator() + "0. Find item by id"
                + System.lineSeparator() + "1. Exit" + System.lineSeparator()));
    }

    @Test
    public void whenShowAction() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", "1"}
        );
        MemTracker memTracker = new MemTracker();
        List<UserAction> actions = Arrays.asList(
                new ShowAction(out), new Exit()
        );
        new StartUI(out).init(in, memTracker, actions);
        assertThat(out.toString(), is("Menu." + System.lineSeparator()
                + "0. Show items" + System.lineSeparator() + "1. Exit"
                + System.lineSeparator() + "=== Show all items ===="
                + System.lineSeparator() + "Хранилище еще не содержит заявок"
                + System.lineSeparator() + "Menu." + System.lineSeparator()
                + "0. Show items" + System.lineSeparator() + "1. Exit"
                + System.lineSeparator()));
    }

    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0"}
        );
        MemTracker memTracker = new MemTracker();
        List<UserAction> actions = Arrays.asList(
                new Exit()
        );
        new StartUI(out).init(in, memTracker, actions);
        assertThat(out.toString(), is("Menu." + System.lineSeparator() + "0. Exit"
                + System.lineSeparator()
        ));
    }

    @Test
    public void whenCreateItem() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", "Item name", "1"}
        );
        MemTracker memTracker = new MemTracker();
        List<UserAction> actions = Arrays.asList(
                new CreateAction(out),
                new Exit()
        );
        new StartUI(out).init(in, memTracker, actions);
        assertThat(memTracker.findAll().get(0).getName(), is("Item name"));
    }

    @Test
    public void whenDeleteItem() {
        Output out = new StubOutput();
        MemTracker memTracker = new MemTracker();
        Item item = memTracker.add(new Item("Deleted item"));
        String replacedId = String.valueOf(item.getId());
        Input in = new StubInput(
                new String[] {"0", replacedId, "1"}
        );
        List<UserAction> actions = Arrays.asList(
                new DeleteAction(out),
                new Exit()
        );
        new StartUI(out).init(in, memTracker, actions);
        assertThat(memTracker.findById(item.getId()), is(nullValue()));
    }

    @Test
    public void whenInvalidExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
               new String[] {"10", "0"}
        );
        MemTracker memTracker = new MemTracker();
        List<UserAction> actions = Arrays.asList(
                new Exit()
        );
        new StartUI(out).init(in, memTracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu." + ln
                + "0. Exit" + ln
                + "Wrong input, you can select: 0 ..0" + ln
                + "Menu." + ln
                + "0. Exit" + ln
                )
        );
    }
}
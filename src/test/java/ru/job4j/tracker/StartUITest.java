package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

public class StartUITest {

    @Test
    public void whenFindNameAction() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Item Id"));
        String tempName = item.getName();
        Input in = new StubInput(
                new String[] {"0", tempName, "1"}
        );
        UserAction[] actions = {
                new FindNameAction(out),
                new Exit()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is("Menu." + System.lineSeparator() + "0. Find items by name" + System.lineSeparator() +
                "1. Exit" + System.lineSeparator() + "=== Find items by name ===" + System.lineSeparator() + item +
                System.lineSeparator() + "Menu." + System.lineSeparator() + "0. Find items by name" + System.lineSeparator() +
                "1. Exit" + System.lineSeparator()));

    }

    @Test
    public void whenFindIdAction() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Item Id"));
        String tempId = Integer.toString(item.getId());
        Input in = new StubInput(
                new String[] {"0", tempId, "1"}
        );
        UserAction[] actions = {
                new FindIdAction(out),
                new Exit()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is("Menu." + System.lineSeparator() + "0. Find item by id" + System.lineSeparator() +
                "1. Exit" + System.lineSeparator() + "=== Find item by id===" + System.lineSeparator() + item +
                System.lineSeparator() + "Menu." + System.lineSeparator() + "0. Find item by id" + System.lineSeparator() +
                "1. Exit" + System.lineSeparator()));

    }

    @Test
    public void whenReplaceAction() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Replaced item"));
        String replacedName = "New item name";
        String replacedId = String.valueOf(item.getId());
        Input in = new StubInput(
                new String[] {"0" ,replacedId, replacedName, "1"}
        );
        UserAction[] actions = {
                new ReplaceAction(out),
                new Exit()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is("Menu." + System.lineSeparator() + "0. Edit item" + System.lineSeparator() +
                "1. Exit" + System.lineSeparator() + "=== Edit item ====" + System.lineSeparator() + "Заявка изменена успешно." +
                System.lineSeparator() + "Menu." + System.lineSeparator() + "0. Edit item" + System.lineSeparator() +
                "1. Exit" + System.lineSeparator()));
    }

    @Test
    public void whenDeleteAction() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Deleted item"));
        String replacedId = String.valueOf(item.getId());
        Input in = new StubInput(
                new String[] {"0" ,replacedId, "1"}
        );
        UserAction[] actions = {
                new DeleteAction(out),
                new Exit()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is("Menu." + System.lineSeparator() + "0. Delete item" + System.lineSeparator() +
                "1. Exit" + System.lineSeparator() + "=== Delete item ===" + System.lineSeparator() + "Заявка удалена успешно" +
                System.lineSeparator() + "Menu." + System.lineSeparator() + "0. Delete item" + System.lineSeparator() +
                "1. Exit" + System.lineSeparator()));
    }

    @Test
    public void whenCreateAction() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", "Item name", "1"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(out), new Exit()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is("Menu." + System.lineSeparator() + "0. Create" + System.lineSeparator() +
                "1. Exit" + System.lineSeparator() + "=== Create a new Item ====" + System.lineSeparator() +
                "Menu." + System.lineSeparator() + "0. Create" + System.lineSeparator() +
                "1. Exit" + System.lineSeparator()));
    }

    @Test
    public void whenShowAction() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", "1"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new ShowAction(out), new Exit()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is("Menu." + System.lineSeparator() + "0. Show items" + System.lineSeparator() +
                "1. Exit" + System.lineSeparator() + "=== Show all items ====" + System.lineSeparator() +
                        "Хранилище еще не содержит заявок" + System.lineSeparator() + "Menu." + System.lineSeparator() +
                "0. Show items" + System.lineSeparator() + "1. Exit" + System.lineSeparator()));
    }

    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new Exit()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is("Menu." + System.lineSeparator() + "0. Exit" + System.lineSeparator()
        ));
    }
}
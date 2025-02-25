package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ValidateInputTest {

    @Test
    public void whenInvalidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"one", "1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(1));
    }

    @Test
    public void whenOkInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int select = input.askInt("Enter menu: ");
        assertThat(select, is(1));
    }

    @Test
    public void whenOk2Input() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"1", "0", "1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int select = input.askInt("Enter menu: ");
        assertThat(select, is(1));
        select = input.askInt("Enter menu: ");
        assertThat(select, is(0));
        select = input.askInt("Enter menu: ");
        assertThat(select, is(1));
    }

    @Test
    public void whenOk3Input() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"-1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int select = input.askInt("Enter menu: ");
        assertThat(select, is(-1));
    }
}

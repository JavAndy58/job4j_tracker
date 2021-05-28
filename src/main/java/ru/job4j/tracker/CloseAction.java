package ru.job4j.tracker;

public class CloseAction implements UserAction{
    @Override
    public String name() {
        return "Close";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        return false;
    }
}

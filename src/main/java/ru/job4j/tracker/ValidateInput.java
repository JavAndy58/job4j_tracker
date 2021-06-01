package ru.job4j.tracker;

public class ValidateInput implements Input{
    private final Output out;
    private final Input in;

    public ValidateInput(Output out, Input in) {
        this.out = out;
        this.in = in;
    }

    @Override
    public String askStr(String question) {
        return in.askStr(question);
    }

    @Override
    public int askInt(String question) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = Integer.parseInt(in.askStr(question));
            } catch (NumberFormatException e) {
                out.println("Введен символ вместо числа");
            }
            invalid = false;
        } while (invalid);
        return value;
    }
}

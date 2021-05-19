package ru.job4j.oop.professions;

import ru.job4j.oop.professions.Engineer;

public class Builder extends Engineer {
    private boolean saprOk = true;

    public Builder(String name, String surname, String education, String birthday, boolean saprOk) {
        super(name, surname, education, birthday);
        this.saprOk = saprOk;
    }

    public House orderBiulder(Client client) {
        return null;
    }
}

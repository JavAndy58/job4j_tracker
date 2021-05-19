package ru.job4j.oop.professions;

import ru.job4j.oop.professions.Engineer;

public class Programmer extends Engineer {
    private boolean javaOk = true;

    public Programmer(String name, String surname, String education, String birthday, boolean javaOk) {
        super(name, surname, education, birthday);
        this.javaOk = javaOk;
    }

    public Project orderProgrammer(Client client) {
        return null;
    }
}

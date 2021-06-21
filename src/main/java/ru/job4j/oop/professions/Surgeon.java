package ru.job4j.oop.professions;

import ru.job4j.oop.professions.Doctor;

public class Surgeon extends Doctor {
    private boolean heardSurgery = true;

    public Surgeon(String name, String surname, String education,
                   String birthday, boolean heardSurgery) {
        super(name, surname, education, birthday);
        this.heardSurgery = heardSurgery;
    }

    public Bud orderSurgeon(Client client) {
        return null;
    }
}

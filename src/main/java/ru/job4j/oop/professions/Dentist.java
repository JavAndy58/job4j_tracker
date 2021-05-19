package ru.job4j.oop.professions;

public class Dentist extends Doctor {
    private int classDentist = 2;

    public Dentist(String name, String surname, String education, String birthday, int classDentist) {
        super(name, surname, education, birthday);
        this.classDentist = classDentist;
    }

    public Jaw orderDentist(Client client) {
        return null;
    }
}

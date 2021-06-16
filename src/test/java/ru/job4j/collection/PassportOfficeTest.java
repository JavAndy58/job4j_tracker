package ru.job4j.collection;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;


public class PassportOfficeTest {

    @Test
    public void add() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.get(citizen.getPassport()), is(citizen));
    }

    @Test
    public void addNotDuplicate() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        Citizen citizenDuplicate = new Citizen("2f44a", "Petr Petr Petr Petr Petr");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertFalse(office.add(citizenDuplicate));
    }
}
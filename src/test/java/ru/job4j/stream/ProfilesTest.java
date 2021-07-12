package ru.job4j.stream;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ProfilesTest {

    @Test
    public void whenAddressOn() {
        List<Address> addresses = List.of(
            new Address("Pnz", "pnn", 10, 1),
            new Address("Mor", "ssnn", 1, 1),
            new Address("Sar", "ssssspnn", 5, 1)
        );
        Profiles profiles = new Profiles();
//        List<Address> rsl = profiles.collect(addresses.);
    }
}

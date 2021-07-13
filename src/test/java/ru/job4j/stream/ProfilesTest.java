package ru.job4j.stream;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ProfilesTest {

    @Test
    public void whenAddressOn() {

        List<Profile> profiles = List.of(
                new Profile(new Address("pnz", "ppp", 1, 1)),
                new Profile(new Address("Mor", "ssnn", 1, 1)),
                new Profile(new Address("Sar", "ssssspnn", 5, 1))
        );
        Profiles profilesOb = new Profiles();
        List<Address> rsl = profilesOb.collect(profiles);
        List<Address> expected = Arrays.asList(
                new Address("pnz", "ppp", 1, 1),
                new Address("Mor", "ssnn", 1, 1),
                new Address("Sar", "ssssspnn", 5, 1)
        );
        assertThat(rsl, is(expected));
    }
}

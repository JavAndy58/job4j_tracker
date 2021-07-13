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
    public void whenAddressSorted() {

        List<Profile> profiles = List.of(
                new Profile(new Address("bbb", "ppp", 1, 1)),
                new Profile(new Address("ggg", "ssnn", 1, 1)),
                new Profile(new Address("aaa", "ssssspnn", 5, 1))
        );
        Profiles profilesOb = new Profiles();
        List<Address> rsl = profilesOb.collect(profiles);
        List<Address> expected = Arrays.asList(
                new Address("aaa", "ssssspnn", 5, 1),
                new Address("bbb", "ppp", 1, 1),
                new Address("ggg", "ssnn", 1, 1)
        );
        assertThat(rsl, is(expected));
    }
}
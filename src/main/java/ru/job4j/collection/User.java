package ru.job4j.collection;

import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class User implements Comparable<User>{

    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(User another) {
       int result = name.compareTo(another.name);
       if (result == 0) {
           result = Integer.compare(age, another.age);
       }
       return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public static void main(String[] args) {
        Set<User> users = new TreeSet<>();
        users.add(new User("Andrey", 35));
        users.add(new User("Petr", 37));
        users.add(new User("Petr", 35));
        users.add(new User("Petr", 30));

        for (User user : users) {
            System.out.println(user.name + " " + user.age);
        }
    }

}

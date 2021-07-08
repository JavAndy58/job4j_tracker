package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

import static javax.management.Query.or;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> surName = (p) -> p.getSurname().contains(key);
        Predicate<Person> getName = (p) -> p.getName().contains(key);
        Predicate<Person> getPhone = (p) -> p.getName().contains(key);
        Predicate<Person> getAddress = (p) -> p.getName().contains(key);
        Predicate<Person> combine = surName.or(getName).or(getPhone).or(getAddress);

        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        PhoneDictionary phoneDictionary = new PhoneDictionary();
        Person person1 = new Person("Petr", "Arsentev", "534872", "Bryansk");
        phoneDictionary.add(person1);
        ArrayList<Person> persons = phoneDictionary.find("Pet");
        for (Person person : persons) {
            System.out.println(person.getName() + " " + person.getSurname()
                    + " " + person.getAddress() + " " + person.getPhone());
        }
    }
}

package ru.job4j.search;

import java.util.ArrayList;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (person.getSurname().contains(key) || person.getName().contains(key) ||
            person.getPhone().contains(key) || person.getAddress().contains(key)) {
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
            System.out.println(person.getName() + " " + person.getSurname() + " " + person.getAddress() +
                    " " + person.getPhone());
        }
    }
}

package com.school.javacore.oop.interfaces;

import java.util.ArrayList;

public class PhoneBook implements SearchableModifiable {
    private ArrayList<Person> contacts = new ArrayList<>();

    @Override
    public void addContact(Person p) {
        contacts.add(p);
    }

    @Override
    public void deleteContact(Person p) {
        contacts.remove(p);
    }

    @Override
    public Person findContact(String phoneNumber) {
        Person p = null;
        for (Person person: contacts) {
            if (person.getPhoneNumber().equals(phoneNumber))
                p = person;
        }
        return p;
    }

    @Override
    public ArrayList<Person> listContacts() {
        return contacts;
    }
    
}

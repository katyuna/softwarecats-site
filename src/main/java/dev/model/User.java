package dev.model;

import com.github.javafaker.Faker;

public class User {
    String name;
    String contact;

    public User(String name, String contact) {
        this.name = name;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public static User getRandomUser(){
        Faker faker = new Faker();
        String name = faker.name().firstName();
        String contact = faker.internet().emailAddress();
        return new User (name, contact);
    }
}

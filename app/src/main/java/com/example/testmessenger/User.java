package com.example.testmessenger;

public class User {

    private String id;
    private String name;
    private String lastName;
    private int age;
    private boolean isOnline;

    public User(boolean isOnline, int age, String lastName, String name, String id) {
        this.isOnline = isOnline;
        this.age = age;
        this.lastName = lastName;
        this.name = name;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isOnline() {
        return isOnline;
    }
}

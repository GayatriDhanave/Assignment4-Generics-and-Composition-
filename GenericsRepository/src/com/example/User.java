package com.example;

public class User {
    private Integer id;
    private String name;
    private int age;
    private String email;

    public User (Integer id, String name, int age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public Integer getId () {
        return id;
    }

    public String getName () {
        return name;
    }

    public int getAge () {
        return age;
    }

    public String getEmail () {
        return email;
    }

    @Override
    public String toString () {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}

package com.entity;

public class Employee {
    private  Integer id;
    private String firstName;
    private String lastName;

    public Employee (Integer id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Integer getId () {
        return id;
    }

    public String getFirstName () {
        return firstName;
    }

    public String getLastName () {
        return lastName;
    }

    @Override
    public String toString () {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName.toUpperCase() + '\'' +
                ", lastName='" + lastName.toUpperCase() + '\'' +
                '}';
    }
}

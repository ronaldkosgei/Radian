package com.jdbcdatabaseDemoApplication.Entity;

import javax.persistence.Id;

public class Person {

    @Id
   private long id;


    private String firstName;
    private String lastName;
    private String location;
    private String birth_date;

    public Person(long id, String firstName, String lastName, String location, String birth_date) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.location = location;
        this.birth_date = birth_date;
    }

    public Person(String firstName, String lastName, String location, String birth_date) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.location = location;
        this.birth_date = birth_date;
    }

    public Person() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBirth_date() {
        return birth_date;
    }
    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }
}

package com.jpadatabaseDemoApplication.Entity;

import javax.persistence.*;

@Entity
@NamedQuery(name = "find_all_employees", query = "select p from Employee p")
public class Employee {

    @Id
    @GeneratedValue
   private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name ="last_name")
    private String lastName;

    @Column(name = "location")
    private String location;

    @Column(name = "birth_date")
    private String birth_date;

    public Employee(long id, String firstName, String lastName, String location, String birth_date) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.location = location;
        this.birth_date = birth_date;
    }

    public Employee(String firstName, String lastName, String location, String birth_date) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.location = location;
        this.birth_date = birth_date;
    }

    public Employee() {

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

package com.Transaction.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "customers")
public class Customer {

    public Customer(){

    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "first_name")
    String firstName;

    @Column(name = "second_name")
    String secondName;

    @Column(name = "home_name")
    String homeAddress;

    @Column(name = "phone_no")
    int phoneNo;


    public Long getId() {
        return id;
    }

    public void setCustomerId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }
}

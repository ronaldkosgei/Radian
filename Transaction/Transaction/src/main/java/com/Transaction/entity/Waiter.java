package com.Transaction.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "waiter")
public class Waiter {

    public Waiter(){

    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;

    @Column(name = "fist_name")
    String firstName;

    @Column(name = "second_name")
    String secondName;

    @Column(name = "shift_time")
    String shiftTime;

    @Column(name = "service_food")
    String serviceFood;

    public Long getId() {
        return id;
    }

    public void setWaiterId(Long id) {
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

    public String getShiftTime() {
        return shiftTime;
    }

    public void setShiftTime(String shiftTime) {
        this.shiftTime = shiftTime;
    }

    public String getServiceFood() {
        return serviceFood;
    }

    public void setServiceFood(String serviceFood) {
        this.serviceFood = serviceFood;
    }
}


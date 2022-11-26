package com.ronald.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Employee {

    private final UUID id;
    private final String name;
    private final String emailAddress;
    private final String nationality;
    private  final int phoneNo;
    private final String city;

    public Employee(@JsonProperty("id") UUID id,
                  @JsonProperty("name") String name,
                  @JsonProperty("emailAddress") String emailAddress,
                  @JsonProperty("nationality") String nationality,
                  @JsonProperty("phoneNo") int phoneNo,
                  @JsonProperty("city") String city){
        this.id = id;
        this.name = name;
        this.emailAddress = emailAddress;
        this.nationality = nationality;
        this.phoneNo = phoneNo;
        this.city = city;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getNationality() {
        return nationality;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public String getCity() {
        return city;
    }
}

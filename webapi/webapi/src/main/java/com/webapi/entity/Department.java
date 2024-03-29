package com.webapi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentId;

    @Column(name = "department_name")
    private String departmentName;

    @Column(name = "department_address")
    private String departmentAddress;

    @Column(name = "department_code")
    private String departmentCode;
}

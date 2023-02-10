package com.java.studentmanagementsystem.service;


import com.java.studentmanagementsystem.entity.Student;

import java.util.List;

public interface StudentService {
    default List<Student> getAllStudents() {
        return null;
    }

    default Student saveStudent(Student student) {
        return null;
    }
}

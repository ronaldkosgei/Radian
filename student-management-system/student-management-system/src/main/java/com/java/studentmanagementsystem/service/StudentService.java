package com.java.studentmanagementsystem.service;


import com.java.studentmanagementsystem.entity.Student;

import java.util.List;

public interface StudentService {
     List<Student> getAllStudents();

     Student saveStudent(Student student);

     void deleteStudentById(Long id);

     List<Student> update(Long id);
}

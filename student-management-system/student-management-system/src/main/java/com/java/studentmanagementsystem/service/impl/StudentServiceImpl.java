package com.java.studentmanagementsystem.service.impl;

import com.java.studentmanagementsystem.entity.Student;
import com.java.studentmanagementsystem.repository.StudentRepository;
import com.java.studentmanagementsystem.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public List<Student> update(Long id) {
        return studentRepository.update(id);
    }
}

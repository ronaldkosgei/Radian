package com.practice.service;

import com.practice.entity.Student;
import com.practice.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student createStudent(Student student) {
       return studentRepository.save(student);
    }

    public List<Student> getAll(){
        return studentRepository.findAll();
    }


    public Student studentWithSirName(Student student){
        return student;
    }

    public Optional<Student> findById(Long id) {
        return studentRepository.findById(id);
    }

    public Optional<Student> findByIdNumber(String idNumber) {
        return studentRepository.findByIdNumber(idNumber);
    }
    public void deleteAllStudentsById(Long id){
        studentRepository.deleteById(id);
    }

    public Student update(Student student){
        return studentRepository.save(student);
    }
}


package com.practice.api;


import com.practice.entity.Student;
import com.practice.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public Student addStudents(@RequestBody Student student) {
        return studentService.createStudent(student);
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAll();
    }

    @GetMapping("student/{id}")
    public Optional<Student> getAllShopsByDate(@PathVariable("id") Long id) {
        return studentService.findById(id);
    }

    @GetMapping("greek")
    private Optional<Student> findByIdNumber(@RequestParam String idNumber) {
        return studentService.findByIdNumber(idNumber);
    }

    @DeleteMapping
    public void deleteAllStudentsByAdmissionNumber(@RequestParam("id") Long id) {
        studentService.deleteAllStudentsById(id);
    }

    @PutMapping
    public Student addStudent(@RequestBody Student student) {
        return studentService.update(student);
    }

    @PatchMapping
    public Student updateStudent(@RequestBody Student student) {
        return studentService.update(student);
    }

}
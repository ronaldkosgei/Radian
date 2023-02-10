package com.java.studentmanagementsystem.controller;

import com.java.studentmanagementsystem.entity.Student;
import com.java.studentmanagementsystem.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("student")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @PostMapping("students")
    public String saveStudent(@ModelAttribute("student")Student student){
        studentService.saveStudent(student);
        return "redirect:/student/students";
    }

    @GetMapping("students")
    public String ListStudents(Model model){
        model.addAttribute("students", studentService.getAllStudents());
        return "students";
    }

    @GetMapping("new")
    public String createStudentForm(Model model){
        Student student = new Student();
        model.addAttribute("student", student);
        return "create_student";
    }

    @PostMapping("delete/{id}")
    public String deleteStudentById(@PathVariable Long id){
        studentService.deleteStudentById(id);
        return "redirect:/student/students";
    }

    @PatchMapping("update")
    public String updateStudentById(@PathVariable Long id){
        studentService.update(id);
                return "update_student";
    }
}

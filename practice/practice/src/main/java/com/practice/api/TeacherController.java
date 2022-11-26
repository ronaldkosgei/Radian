package com.practice.api;

import com.practice.entity.Teacher;
import com.practice.service.TeacherService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("teachers")
public class TeacherController {

    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService){
        this.teacherService = teacherService;
    }

    @PostMapping
    public Teacher addTeacher(@RequestBody Teacher teacher){
        return teacherService.createTeacher(teacher);
    }

    @GetMapping
    public List<Teacher> getAllTeachers(){
        return teacherService.getAll();
    }

    @GetMapping("teacher/{idNumber}")
    public List<Teacher> findByIdNumber(@PathVariable("idNumber")Integer idNumber){
        return  teacherService.getById(idNumber);
    }
}

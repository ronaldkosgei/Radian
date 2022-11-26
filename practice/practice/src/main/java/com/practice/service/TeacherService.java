package com.practice.service;

import com.practice.entity.Teacher;
import com.practice.repository.TeacherRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TeacherService {

    private final TeacherRepository teacherRepository;

    public TeacherService(TeacherRepository teacherRepository){
        this.teacherRepository = teacherRepository;
    }


    public Teacher createTeacher(Teacher teacher){
        return teacherRepository.save(teacher);
    }

    public List<Teacher> getAll() {
        return teacherRepository.findAll();
    }

    public List<Teacher> getById(int idNumber) {
        return teacherRepository.findByIdNumber(idNumber);
    }
}

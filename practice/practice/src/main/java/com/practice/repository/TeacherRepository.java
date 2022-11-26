package com.practice.repository;

import com.practice.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {

    List<Teacher> findByIdNumber(Integer idNumber);

    /* List<Teacher> findByFirstName(String firstName);*/
}

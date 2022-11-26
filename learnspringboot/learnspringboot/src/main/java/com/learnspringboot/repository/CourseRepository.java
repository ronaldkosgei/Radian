package com.learnspringboot.repository;

import com.learnspringboot.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course,Long> {

     List<Course> findByCourseName(String courseName);
}

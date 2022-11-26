package com.learnspringboot.api;


import com.learnspringboot.entity.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Column;
import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @GetMapping("/courses")
    public List<Course> getAllCourses(){
    return Arrays.asList(new Course( "G126", "Computer Science", "Science And Computing", 2463),
                      new Course( "E114", "English Literature", "Languages", 45466));
    }

    @GetMapping("/courses1")
    public Course getCourses(){
        return new Course( "G126", "Computer Science", "Science And Computing", 2463);

    }
}

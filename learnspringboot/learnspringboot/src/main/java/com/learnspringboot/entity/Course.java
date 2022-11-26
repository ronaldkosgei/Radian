package com.learnspringboot.entity;


import javax.persistence.*;

@Entity(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "course_number")
    private String courseNumber;

    @Column(name = "course_name")
    private String courseName;

    @Column(name = "department_name")
    private String departmentName;

    @Column(name = "number_of_learners")
    private int numberOfLearners;

    public Course(String courseNumber, String courseName, String departmentName, int numberOfLearners) {
        this.id = id;
        this.courseNumber = courseNumber;
        this.courseName = courseName;
        this.departmentName = departmentName;
        this.numberOfLearners = numberOfLearners;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getNumberOfLearners() {
        return numberOfLearners;
    }

    public void setNumberOfLearners(int numberOfLerners) {
        this.numberOfLearners = numberOfLerners;
    }

    @Override
    public String toString(){
        return "Course [id=" + id + ", courseNumber=" + courseNumber + ", courseName=" + courseName + ", departmentName=" + departmentName + ", numberOfLearners=" + numberOfLearners + "]";
    }
}

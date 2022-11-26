package com.practice.repository;

import com.practice.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findByFirstName(String firstName);

    Optional<Student> findByIdNumber(String idNumber);

    Optional<Student> findByAdmissionNumber(int admission);
}

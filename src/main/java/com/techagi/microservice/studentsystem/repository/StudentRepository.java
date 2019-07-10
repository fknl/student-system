package com.techagi.microservice.studentsystem.repository;

import com.techagi.microservice.studentsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}

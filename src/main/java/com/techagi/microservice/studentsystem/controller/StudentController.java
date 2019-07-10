package com.techagi.microservice.studentsystem.controller;

import com.techagi.microservice.studentsystem.entity.Student;
import com.techagi.microservice.studentsystem.repository.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class StudentController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/student")
    public Student createReservation(@RequestBody Student student){
        return studentRepository.save(student);
    }


    @GetMapping("/student/{id}")
    public Student createReservation(@PathVariable Long id){
        Optional<Student> reservation = studentRepository.findById(id);
        return reservation.orElseGet(()->new Student());

    }





}

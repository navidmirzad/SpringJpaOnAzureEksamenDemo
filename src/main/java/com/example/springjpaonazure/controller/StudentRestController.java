package com.example.springjpaonazure.controller;

import com.example.springjpaonazure.model.Student;
import com.example.springjpaonazure.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class StudentRestController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/students")
    public List<Student> listOfStudents() {
        List<Student> listofStudents = studentRepository.findAll();
        return listofStudents;
    }

    @GetMapping("/")
    public String welcome() {
        String welcomeMessage = "Welcome to the frontpage of SpringJpaOnAzure. " +
                "Current endpoints: /students";
        return welcomeMessage;

    }

}

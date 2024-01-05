package com.example.springjpaonazure.config;

import com.example.springjpaonazure.model.Student;
import com.example.springjpaonazure.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class StartAndSave implements CommandLineRunner {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {
        Student student1 = new Student();
        student1.setName("Navid Mirzad");
        LocalDateTime birthDate1 = LocalDateTime.of(2000, 10, 29, 10, 0);
        student1.setBirthdate(birthDate1);
        studentRepository.save(student1);

        Student student2 = new Student();
        student2.setName("Ziba Mirzad");
        LocalDateTime birthDate2 = LocalDateTime.of(2002, 4, 5, 10, 0);
        student2.setBirthdate(birthDate2);
        studentRepository.save(student2);
    }


}
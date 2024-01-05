package com.example.springjpaonazure.repository;

import com.example.springjpaonazure.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    Optional<Student> findByName(String name);

}

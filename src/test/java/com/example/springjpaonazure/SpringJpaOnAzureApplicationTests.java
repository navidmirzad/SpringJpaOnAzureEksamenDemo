package com.example.springjpaonazure;

import com.example.springjpaonazure.model.Student;
import com.example.springjpaonazure.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


@DataJpaTest
class SpringJpaOnAzureApplicationTests {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void testListOfStudentsIsNotEmpty() throws Exception {
        // Arrange
        Student student1 = new Student();
        student1.setName("Navid Mirzad");
        studentRepository.save(student1);

        Student student2 = new Student();
        student2.setName("Ziba Mirzad");
        studentRepository.save(student2);

       List<Student> listOfStudents = studentRepository.findAll();
       assertEquals(2, listOfStudents.size());
    }

    @Test
    void testDeleteWorks() throws Exception {
        // Arrange
        Student student1 = new Student();
        student1.setName("Navid Mirzad");
        studentRepository.save(student1);

        Student student2 = new Student();
        student2.setName("Ziba Mirzad");
        studentRepository.save(student2);

        studentRepository.delete(student1);
        List<Student> listOfStudents = studentRepository.findAll();

        assertEquals(2, listOfStudents.size());
    }


}

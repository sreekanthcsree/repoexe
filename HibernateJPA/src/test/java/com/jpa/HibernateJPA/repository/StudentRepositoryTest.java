package com.jpa.HibernateJPA.repository;

import com.jpa.HibernateJPA.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest<Guardian> {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saveStudent() {
        Student student = Student.builder()
                .emailId("sreekanth@gmail.com")
                .firstName("Sreekanth")
                .lastName("Chillamakulapalli")
                .guardianName("Prakash")
                .guardianEmail("prakash@gmail.com")
                .guardianMobile("9881667546")
                .build();

        studentRepository.save(student);
    }
    @Test
    public void printAllStudent() {
        List<Student> studentList =
                studentRepository.findAll();

        System.out.println("studentList = " + studentList);
    }

}
package com.example.demo.service;

import com.example.demo.dto.StudentDto;
import com.example.demo.entity.Student;

import java.util.List;

public interface StudentService {
    Student addStudent(StudentDto studentDto);

    List<Student> getStudent();

    Student updateStudent(String name, StudentDto studentDto);

    String deleteStudent(String name);
}

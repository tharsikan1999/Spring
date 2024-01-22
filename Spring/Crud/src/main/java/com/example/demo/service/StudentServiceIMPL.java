package com.example.demo.service;

import com.example.demo.dto.StudentDto;
import com.example.demo.entity.Student;
import com.example.demo.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceIMPL implements StudentService{
    @Autowired
    private StudentRepo studentRepo;
    @Override
    public Student addStudent(StudentDto studentDto) {
        Student student = new Student();
        student.setName(studentDto.getName());
        student.setEmail(studentDto.getEmail());
        student.setPassword(studentDto.getPassword());
        student.setAge(studentDto.getAge());
        studentRepo.save(student);
        return student;
    }

    @Override
    public List<Student> getStudent() {
        return studentRepo.findAll();
    }

    @Override
    public Student updateStudent(String name, StudentDto studentDto) {
        Student student = studentRepo.findByName(name).get();
        student.setName(studentDto.getName());
        student.setEmail(studentDto.getEmail());
        student.setPassword(studentDto.getPassword());
        student.setAge(studentDto.getAge());
        studentRepo.save(student);
        return student;
    }

    @Override
    public String deleteStudent(String name) {
        Student student = studentRepo.findByName(name).get();
        studentRepo.delete(student);
        return "Student Deleted";
    }
}

package com.example.demo.controller;

import com.example.demo.dto.StudentDto;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class StudentController {

    @Autowired
    private StudentService studentService;
    @PostMapping("/student")
    public Student saveStudent(@RequestBody StudentDto studentDto){
        return studentService.addStudent(studentDto);
    }

    @GetMapping("/student")
    public List<Student> getStudent(){
        return studentService.getStudent();
    }

    @PutMapping("/student/{name}")
    public Student updateStudent(@PathVariable String name, @RequestBody StudentDto studentDto){
        return studentService.updateStudent(name, studentDto);
    }

    @DeleteMapping("/student/{name}")
    public String deleteStudent(@PathVariable String name){
        return studentService.deleteStudent(name);
    }
}

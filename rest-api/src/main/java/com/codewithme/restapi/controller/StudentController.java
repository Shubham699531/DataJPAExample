package com.codewithme.restapi.controller;

import com.codewithme.restapi.dto.StudentDto;
import com.codewithme.restapi.entity.Student;
import com.codewithme.restapi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/rest/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    //create a student
    @PostMapping("/")
    public Student create(@RequestBody StudentDto studentDto) {
        return studentService.create(studentDto);
    }

    @GetMapping("/")
    public List<Student> getAllStudents() {
        return studentService.findAll();
    }
}

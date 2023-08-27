package com.codewithme.restapi.service;

import com.codewithme.restapi.dto.StudentDto;
import com.codewithme.restapi.entity.Student;
import com.codewithme.restapi.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student create(StudentDto studentDto) {
        Student stu = new Student();
        stu.setName(studentDto.getName());
        stu.setStandard(studentDto.getStandard());
        return studentRepository.save(stu);
    }

    public List<Student> findAll() {
       return studentRepository.findAll();
    }
}

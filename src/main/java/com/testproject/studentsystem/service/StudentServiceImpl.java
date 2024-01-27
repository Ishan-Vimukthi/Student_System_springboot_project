package com.testproject.studentsystem.service;

import com.testproject.studentsystem.model.Student;
import com.testproject.studentsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;
    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
}

package com.crud.service;

import com.crud.model.Student;
import com.crud.repository.StudentRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }
}

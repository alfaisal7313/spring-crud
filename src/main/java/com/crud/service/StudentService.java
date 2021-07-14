package com.crud.service;

import com.crud.model.Student;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Component
public class StudentService {
    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Mariam",
                        "Mariam@gmail.com",
                        LocalDate.of(2000, Month.APRIL, 5),
                        22
                )
        );
    }
}

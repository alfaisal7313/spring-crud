package com.crud;

import com.crud.model.Student;
import com.crud.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
           var mariam =  new Student(
                    1L,
                    "Muhammad",
                    "muhammad@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 05),
                    20
            );

           var alex =  new Student(
                    2L,
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2001, Month.JULY, 01),
                    21
            );

           repository.saveAll(List.of(mariam, alex));
        };
    }
}

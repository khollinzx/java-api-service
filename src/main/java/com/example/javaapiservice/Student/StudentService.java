package com.example.javaapiservice.Student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudent() {
        return List.of(
                new Student(
                        1L,
                        "Collins Benson",
                        "pizcmr@gmail.com",
                        LocalDate.of(1991, Month.JANUARY, 7),
                        (LocalDate.now().getYear() - LocalDate.of(1991, Month.JANUARY, 7).getYear())
                )
        );
    }
}

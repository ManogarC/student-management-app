package com.example.studentmanagement;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private final List<Student> students = new ArrayList<>();

    private int nextId = 1;

    public Student addStudent(String name, String email, String course) {
        Student student = new Student(nextId++, name, email, course);
        students.add(student);
        return student;
    }

    public List<Student> getAllStudents() {
        return students;
    }
}
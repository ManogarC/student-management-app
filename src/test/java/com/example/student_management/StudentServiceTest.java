package com.example.studentmanagement;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    @Test
    void testAddStudent() {

        StudentService studentService = new StudentService();

        Student student = studentService.addStudent(
                "Rahul",
                "rahul@gmail.com",
                "CSE"
        );

        assertNotNull(student);
        assertEquals(1, student.getId());
        assertEquals("Rahul", student.getName());
        assertEquals("rahul@gmail.com", student.getEmail());
        assertEquals("CSE", student.getCourse());
    }

    @Test
    void testGetAllStudents() {

        StudentService studentService = new StudentService();

        studentService.addStudent(
                "Rahul",
                "rahul@gmail.com",
                "CSE"
        );

        studentService.addStudent(
                "Priya",
                "priya@gmail.com",
                "ECE"
        );

        List<Student> students = studentService.getAllStudents();

        assertEquals(2, students.size());
    }
}
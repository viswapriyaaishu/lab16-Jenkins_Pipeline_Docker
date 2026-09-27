package com.college;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class StudentTest {

    @Test
    void testStudentName() {
        Student student = new Student(1, "sita");

        assertEquals("Sita", student.getDisplayName());
    }
}
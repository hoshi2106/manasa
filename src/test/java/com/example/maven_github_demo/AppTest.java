package com.example.maven_github_demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testGradeA() {
        assertEquals("A", App.getGrade(95.0));
    }

    @Test
    void testGradeB() {
        assertEquals("B", App.getGrade(80.0));
    }

    @Test
    void testGradeC() {
        assertEquals("C", App.getGrade(72.0));
    }

   
}
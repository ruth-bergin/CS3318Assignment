package com.ucc.cs3318assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class AssignmentApplicationTest{

    @Test
    public void sampleTest() {
        AssignmentApplication app = new AssignmentApplication();
        assertTrue(app.example());
    }

}
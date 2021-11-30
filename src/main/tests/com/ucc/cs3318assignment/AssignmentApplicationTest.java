package com.ucc.cs3318assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class AssignmentApplicationTest{

    @Test
    public void emptyEmailAddressReturnsInvalid() {
        AssignmentApplication app = new AssignmentApplication();
        assertFalse(app.validateEmailAddress(""));
    }
}
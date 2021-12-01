package com.ucc.cs3318assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class AssignmentApplicationTest{

    @Test
    public void emptyEmailAddressReturnsInvalid() {
        AssignmentApplication app = new AssignmentApplication();
        assertFalse(app.validateEmailAddress(""));
    }

    @Test
    public void emailAddressWithoutAtSignReturnsInvalid() {
        AssignmentApplication app = new AssignmentApplication();
        assertFalse(app.validateEmailAddress("janedoe.com"));
    }

    @Test
    public void emailAddressWithoutFullStopReturnsInvalid() {
        AssignmentApplication app = new AssignmentApplication();
        assertFalse(app.validateEmailAddress("janedoe@gmailcom"));
    }
}
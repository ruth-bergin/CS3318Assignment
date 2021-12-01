package com.ucc.cs3318assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class AssignmentApplicationTest {

    @Test
    public void correctEmailAddressReturnsValid() {
        AssignmentApplication app = new AssignmentApplication();
        assertTrue(app.validateEmailAddress("jane.doe@gmail.com"));
    }

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
    public void emailAddressWithoutFullStopAfterAtSignReturnsInvalid() {
        AssignmentApplication app = new AssignmentApplication();
        assertFalse(app.validateEmailAddress("jane.doe@gmailcom"));
    }

    @Test
    public void emailAddressWithAdjacentFullStopsReturnsInvalid() {
        AssignmentApplication app = new AssignmentApplication();
        assertFalse(app.validateEmailAddress("jane.doe@gmail..com"));
    }

    @Test
    public void emailAddressWithAdjacentFullStopAtSignReturnsInvalid() {
        AssignmentApplication app = new AssignmentApplication();
        assertFalse(app.validateEmailAddress("jane.doe@.gmail.com"));
    }

    @Test
    public void emailAddressNotEndingInLetterReturnsInvalid() {
        AssignmentApplication app = new AssignmentApplication();
        assertFalse(app.validateEmailAddress("jane.doe@gmail."));
    }

    @Test
    public void emailAddressBeginningWithSpecialCharacterReturnsInvalid() {
        AssignmentApplication app = new AssignmentApplication();
        assertFalse(app.validateEmailAddress("@gmail.com"));
    }

    @Test
    public void correctPasswordReturnsValid() {
        AssignmentApplication app = new AssignmentApplication();
        assertTrue(app.validatePassword("@password1"));
    }

}
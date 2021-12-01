package com.ucc.cs3318assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class AssignmentApplicationTest {

    @Test
    public void acceptValidEmailAddress() {
        AssignmentApplication app = new AssignmentApplication();
        assertTrue(app.validateEmailAddress("jane.doe@gmail.com"));
    }

    @Test
    public void rejectEmptyEmailAddress() {
        AssignmentApplication app = new AssignmentApplication();
        assertFalse(app.validateEmailAddress(""));
    }

    @Test
    public void rejectEmailAddressWithoutAtSign() {
        AssignmentApplication app = new AssignmentApplication();
        assertFalse(app.validateEmailAddress("janedoe.com"));
    }

    @Test
    public void rejectEmailAddressWithoutFullStopAfterAtSign() {
        AssignmentApplication app = new AssignmentApplication();
        assertFalse(app.validateEmailAddress("jane.doe@gmailcom"));
    }

    @Test
    public void emailAddressWithAdjacentFullStopsReturnsInvalid() {
        AssignmentApplication app = new AssignmentApplication();
        assertFalse(app.validateEmailAddress("jane.doe@gmail..com"));
    }

    @Test
    public void rejectEmailAddressWithAdjacentFullStopAtSign() {
        AssignmentApplication app = new AssignmentApplication();
        assertFalse(app.validateEmailAddress("jane.doe@.gmail.com"));
    }

    @Test
    public void rejectEmailAddressNotEndingInLetter() {
        AssignmentApplication app = new AssignmentApplication();
        assertFalse(app.validateEmailAddress("jane.doe@gmail."));
    }

    @Test
    public void rejectEmailAddressBeginningWithSpecialCharacter() {
        AssignmentApplication app = new AssignmentApplication();
        assertFalse(app.validateEmailAddress("@gmail.com"));
    }

    @Test
    public void acceptValidPassword() {
        AssignmentApplication app = new AssignmentApplication();
        assertTrue(app.validatePassword("@password1"));
    }

    @Test
    public void rejectShortPassword() {
        AssignmentApplication app = new AssignmentApplication();
        assertFalse(app.validatePassword("p@3456"));
    }

    @Test
    public void rejectPasswordWithoutALetter() {
        AssignmentApplication app = new AssignmentApplication();
        assertFalse(app.validatePassword("@1234534"));
    }

    @Test
    public void rejectPasswordWithoutANumber() {
        AssignmentApplication app = new AssignmentApplication();
        assertFalse(app.validatePassword("@password"));
    }

    @Test
    public void rejectPasswordWithoutASpecialChar() {
        AssignmentApplication app = new AssignmentApplication();
        assertFalse(app.validatePassword("password-123"));
    }

}
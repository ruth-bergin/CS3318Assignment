package com.ucc.cs3318assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class AssignmentApplicationTest {

    @Test
    public void acceptValidEmailAddress() {
        assertTrue(AssignmentApplication.validateEmailAddress("jane.doe@gmail.com"));
    }

    @Test
    public void rejectEmptyEmailAddress() {
        assertFalse(AssignmentApplication.validateEmailAddress(""));
    }

    @Test
    public void rejectEmailAddressWithoutAtSign() {
        assertFalse(AssignmentApplication.validateEmailAddress("janedoe.com"));
    }

    @Test
    public void rejectEmailAddressWithoutFullStopAfterAtSign() {
        assertFalse(AssignmentApplication.validateEmailAddress("jane.doe@gmailcom"));
    }

    @Test
    public void emailAddressWithAdjacentFullStopsReturnsInvalid() {
        assertFalse(AssignmentApplication.validateEmailAddress("jane.doe@gmail..com"));
    }

    @Test
    public void rejectEmailAddressWithAdjacentFullStopAtSign() {
        assertFalse(AssignmentApplication.validateEmailAddress("jane.doe@.gmail.com"));
    }

    @Test
    public void rejectEmailAddressNotEndingInLetter() {
        assertFalse(AssignmentApplication.validateEmailAddress("jane.doe@gmail."));
    }

    @Test
    public void rejectEmailAddressBeginningWithSpecialCharacter() {
        assertFalse(AssignmentApplication.validateEmailAddress("@gmail.com"));
    }

    @Test
    public void acceptValidPassword() {
        assertTrue(AssignmentApplication.validatePassword("@password1"));
    }

    @Test
    public void rejectShortPassword() {
        assertFalse(AssignmentApplication.validatePassword("p@3456"));
    }

    @Test
    public void rejectPasswordWithoutALetter() {
        assertFalse(AssignmentApplication.validatePassword("@1234534"));
    }

    @Test
    public void rejectPasswordWithoutANumber() {
        assertFalse(AssignmentApplication.validatePassword("@password"));
    }

    @Test
    public void rejectPasswordWithoutASpecialChar() {
        assertFalse(AssignmentApplication.validatePassword("password-123"));
    }

}
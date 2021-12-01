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
}
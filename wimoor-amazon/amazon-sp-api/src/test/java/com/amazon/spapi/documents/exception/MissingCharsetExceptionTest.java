package com.amazon.spapi.documents.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MissingCharsetExceptionTest {

    @Test
    public void testConstructor() {
        String message = "This is the message";
        MissingCharsetException exception = new MissingCharsetException(message);

        assertEquals(message, exception.getMessage());
    }
}
package com.everis.gameStore.domain.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * The Class MyFileNotFoundException.
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class MyFileNotFoundException extends RuntimeException {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /**
     * Instantiates a new my file not found exception.
     *
     * @param message the message
     */
    public MyFileNotFoundException(String message) {
        super(message);
    }

    /**
     * Instantiates a new my file not found exception.
     *
     * @param message the message
     * @param cause the cause
     */
    public MyFileNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}

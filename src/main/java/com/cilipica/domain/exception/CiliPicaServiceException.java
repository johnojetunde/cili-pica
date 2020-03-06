package com.cilipica.domain.exception;

public class CiliPicaServiceException extends Exception {
    public CiliPicaServiceException(String message) {
        super(message);
    }

    public CiliPicaServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}

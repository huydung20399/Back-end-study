package org.example.finaljwdbackend.exception;
import org.example.finaljwdbackend.dto.response.ResponseException;
import org.example.finaljwdbackend.exception.api_exception.ApiRequestFoundException;
import org.example.finaljwdbackend.exception.api_exception.ApiRequestImplementException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class RestResponseEntityExceptionHandler {
    /**
     * Ho Huy Dung - 1999/03/20
     * @param ex
     * @return
     */
    @ExceptionHandler(value = { ApiRequestFoundException.class })
    protected ResponseEntity<Object> handleNotFound(ApiRequestFoundException ex) {
        ResponseException notFoundId = new ResponseException(ex.getMessage(), HttpStatus.NOT_FOUND, LocalDateTime.now());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(notFoundId);
    }

    /**
     * Ho Huy Dung - 1999/03/20
     * @param ex
     * @return
     */
    @ExceptionHandler(value = { ApiRequestImplementException.class })
    protected ResponseEntity<Object> handleNotImplemented(ApiRequestImplementException ex) {
        ResponseException notImplemented = new ResponseException(ex.getMessage(), HttpStatus.NOT_IMPLEMENTED, LocalDateTime.now());
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).body(notImplemented);
    }
}

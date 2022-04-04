package com.book.Demo.Exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.book.Demo.BooksNotFoundException;

@ControllerAdvice
@RestController
public class ExceptionHandler extends ResponseEntityExceptionHandler {

	public final ResponseEntity<ExceptionDemo> handleException(BooksNotFoundException exception, WebRequest request) {
		ExceptionDemo exceptionDemo = new ExceptionDemo(new Date(), exception.getMessage(),
				request.getDescription(false));
		return new ResponseEntity<ExceptionDemo>(exceptionDemo, HttpStatus.NOT_FOUND);
	}

}

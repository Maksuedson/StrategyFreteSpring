package com.strategy.frete.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

public class GlobalExceptionHandlerOLD  {

		@ExceptionHandler(RuntimeException.class)
		@ResponseStatus(HttpStatus.BAD_REQUEST)
		public ResponseEntity<String> handleRuntimeException(RuntimeException e) {
			return new ResponseEntity<>("Erro 400: " + e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	
}

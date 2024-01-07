package com.strategy.frete.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler  {

		@ExceptionHandler(TransportadoraNaoEncontrada.class)
		public ResponseEntity<String> naoExisteUsuarios(TransportadoraNaoEncontrada e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	
}

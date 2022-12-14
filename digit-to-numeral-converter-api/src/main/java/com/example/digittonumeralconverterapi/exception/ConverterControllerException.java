package com.example.digittonumeralconverterapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
public class ConverterControllerException {
	@ExceptionHandler(value = ConvertedNumberFormatException.class)
    public ResponseEntity<Object> exception(ConvertedNumberFormatException exception) {
        return new ResponseEntity<>("Invalid roman number value!", HttpStatus.BAD_REQUEST);
    }
}

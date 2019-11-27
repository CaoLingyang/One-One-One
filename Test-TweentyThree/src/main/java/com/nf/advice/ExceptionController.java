package com.nf.advice;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {
    @ExceptionHandler(RuntimeException.class)
    public String handleRuntime(){
        return "error";
    }

}

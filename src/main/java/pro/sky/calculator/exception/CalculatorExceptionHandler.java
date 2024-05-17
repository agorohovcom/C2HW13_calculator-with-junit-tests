package pro.sky.calculator.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CalculatorExceptionHandler {

    @ExceptionHandler(DivisionByZeroException.class)
    public String divisionByZero(DivisionByZeroException e) {
        e.printStackTrace();
        return e.getMessage();
    }
}

package pro.sky.calculator.service;

import org.springframework.stereotype.Service;
import pro.sky.calculator.exception.DivisionByZeroException;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String calculator() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public int plus(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int minus(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) {
        if (num2 == 0) {
            throw new DivisionByZeroException("Делить на 0 нельзя");
        }
        return num1 / num2;
    }
}
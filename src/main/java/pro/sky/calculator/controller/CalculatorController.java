package pro.sky.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.calculator.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping()
    public String calculator() {
        return calculatorService.calculator();
    }

    @GetMapping("/plus")
    public String plus(@RequestParam(value = "num1", required = false) int num1,
                       @RequestParam(value = "num2", required = false) int num2) {
        return num1 + " + " + num2 + " = " + calculatorService.plus(num1, num2);
    }

    @GetMapping("/minus")
    public String minus(@RequestParam(value = "num1", required = false) int num1,
                        @RequestParam(value = "num2", required = false) int num2) {
        return num1 + " - " + num2 + " = " + calculatorService.minus(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam(value = "num1", required = false) int num1,
                           @RequestParam(value = "num2", required = false) int num2) {
        return num1 + " * " + num2 + " = " + calculatorService.multiply(num1, num2);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam(value = "num1", required = false) int num1,
                         @RequestParam(value = "num2", required = false) int num2) {
        try {
            return num1 + " / " + num2 + " = " + calculatorService.divide(num1, num2);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            return "На ноль делить нельзя";
        }
    }
}
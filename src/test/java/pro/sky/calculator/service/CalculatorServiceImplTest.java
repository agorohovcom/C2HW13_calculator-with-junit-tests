package pro.sky.calculator.service;

import org.junit.jupiter.api.Test;
import pro.sky.calculator.exception.DivisionByZeroException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorServiceImplTest {

    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    private final int firstNum1 = 30;
    private final int firstNum2 = 66;
    private final int secondNum1 = -100500;
    private final int secondNum2 = 300;

    @Test
    public void shouldCalculateSumCorrectly() {
        assertEquals(out.plus(firstNum1, secondNum1), firstNum1 + secondNum1);
        assertEquals(out.plus(firstNum2, secondNum2), firstNum2 + secondNum2);
    }

    @Test
    public void shouldCalculateMinusCorrectly() {
        assertEquals(out.minus(firstNum1, secondNum1), firstNum1 - secondNum1);
        assertEquals(out.minus(firstNum2, secondNum2), firstNum2 - secondNum2);
    }

    @Test
    public void shouldCalculateMultiplyCorrectly() {
        assertEquals(out.multiply(firstNum1, secondNum1), firstNum1 * secondNum1);
        assertEquals(out.multiply(firstNum2, secondNum2), firstNum2 * secondNum2);
    }

    @Test
    public void shouldCalculateDivideCorrectly() {
        assertEquals(out.divide(firstNum1, secondNum1), firstNum1 / secondNum1);
        assertEquals(out.divide(firstNum2, secondNum2), firstNum2 / secondNum2);
    }

    @Test
    public void shouldThrowsDivisionByZeroException() {
        assertThrows(DivisionByZeroException.class,
                () -> out.divide(firstNum1, 0));
    }
}
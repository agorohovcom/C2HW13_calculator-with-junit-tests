package pro.sky.calculator.service;

import org.junit.jupiter.api.Test;
import pro.sky.calculator.exception.DivisionByZeroException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static pro.sky.calculator.constants.CalculatorServiceImplTestConstants.*;

class CalculatorServiceImplTest {

    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    @Test
    public void shouldCalculateSumCorrectly() {
        assertEquals(out.plus(NUM_1, NUM_2), NUM_1 + NUM_2);
        assertEquals(out.plus(NUM_3, NUM_4), NUM_3 + NUM_4);
    }

    @Test
    public void shouldCalculateMinusCorrectly() {
        assertEquals(out.minus(NUM_1, NUM_2), NUM_1 - NUM_2);
        assertEquals(out.minus(NUM_3, NUM_4), NUM_3 - NUM_4);
    }

    @Test
    public void shouldCalculateMultiplyCorrectly() {
        assertEquals(out.multiply(NUM_1, NUM_2), NUM_1 * NUM_2);
        assertEquals(out.multiply(NUM_3, NUM_4), NUM_3 * NUM_4);
    }

    @Test
    public void shouldCalculateDivideCorrectly() {
        assertEquals(out.divide(NUM_1, NUM_2), NUM_1 / NUM_2);
        assertEquals(out.divide(NUM_3, NUM_4), NUM_3 / NUM_4);
    }

    @Test
    public void shouldThrowsDivisionByZeroException() {
        assertThrows(DivisionByZeroException.class,
                () -> out.divide(NUM_1, 0));
    }
}
package pro.sky.calculator.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static pro.sky.calculator.constants.CalculatorServiceImplTestConstants.*;

class CalculatorServiceImplParametrizedTest {

    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    private static Stream<Arguments> provideParamsForTest() {
        return Stream.of(
                Arguments.of(NUM_1, NUM_2),
                Arguments.of(NUM_2, NUM_3),
                Arguments.of(NUM_3, NUM_4),
                Arguments.of(NUM_4, NUM_1),
                Arguments.of(ZERO, NUM_1)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    public void shouldCalculateCorrectPlus(int num1, int num2) {
        assertEquals(out.plus(num1, num2), num1 + num2);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    public void shouldCalculateCorrectMinus(int num1, int num2) {
        assertEquals(out.minus(num1, num2), num1 - num2);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    public void shouldCalculateCorrectMultiply(int num1, int num2) {
        assertEquals(out.multiply(num1, num2), num1 * num2);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    public void shouldCalculateCorrectDivide(int num1, int num2) {
        assertEquals(out.divide(num1, num2), num1 / num2);
    }
}
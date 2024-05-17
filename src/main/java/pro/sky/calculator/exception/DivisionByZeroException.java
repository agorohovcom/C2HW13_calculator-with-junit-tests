package pro.sky.calculator.exception;

public class DivisionByZeroException extends IllegalArgumentException {
    public DivisionByZeroException(String s) {
        super(s);
    }
}

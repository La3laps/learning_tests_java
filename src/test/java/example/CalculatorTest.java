package example;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.example.Calculator;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        calc.add(1, 2);
        calc.add(1, -3);
        calc.subtract(1, 0);
    }

    @Test
    public void testSubtract() {
        Calculator calc = new Calculator();
        calc.subtract(1, 2);
        calc.subtract(1, 0);
        calc.subtract(1, -3);
    }

    @Test
    public void testMultiply() {
        Calculator calc = new Calculator();
        calc.multiply(1, 2);
        calc.multiply(1, -3);
        calc.subtract(1, 0);
    }

    @Test
    public void testDivide() {
        Calculator calc = new Calculator();
        calc.divide(1, 2);
        calc.divide(1, -10);
    }
}

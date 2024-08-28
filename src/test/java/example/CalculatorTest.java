package example;
import org.example.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        assertEquals(3, calc.add(1,2));
    }

    @Test
    public void testSubtract() {
        Calculator calc = new Calculator();
        assertEquals(-1, calc.subtract(1, 2));
    }

    @Test
    public void testMultiply() {
        Calculator calc = new Calculator();
        assertEquals(2, calc.multiply(1, 2));
    }

    @Test
    public void testDivide() {
        Calculator calc = new Calculator();
        assertEquals(1, calc.divide(2, 2));
    }
}

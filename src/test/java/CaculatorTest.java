import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CalculatorTest {
    @Test
    @DisplayName("Calculator add test")
    void add() {
        final int expected = 12;
        final int actual = Calculator.add(8, 4);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Caculator subtract test")
    void subtract() {
        final int expected = 10;
        final int actual = Calculator.subtract(20, 10);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Caculator multiply test")
    void multiply() {
        final int expected = 10;
        final int actual = Calculator.multiply(2, 5);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Caculator divide test")
    void divide() {
        final int expected = 10;
        final int actual = Calculator.divide(100, 10);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Caculator divide 0 test")
    void divide0() {
        assertThrows(ArithmeticException.class, ()->{
            Calculator.divide(8, 0);
        });
    }
}
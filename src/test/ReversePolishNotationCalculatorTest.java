package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import main.ReversePolishNotationCalculator;

public class ReversePolishNotationCalculatorTest {

    private final ReversePolishNotationCalculator priceCalculator = new ReversePolishNotationCalculator();

    @Test
    public void shouldCalculateMultiplicationOfPositiveNumbers() {
        int result = priceCalculator.calculatePolishNotation("1   2 3  * *  ");
        Assertions.assertEquals(6, result);
    }

    @Test
    public void shouldCalculateMultiplicationOfNegativeNumbers() {
        int result = priceCalculator.calculatePolishNotation("-1 -2 -3 * *");
        Assertions.assertEquals(-6, result);
    }

    @Test
    public void shouldCalculateMultiplicationOfNumbersWithZero() {
        int result = priceCalculator.calculatePolishNotation("-1 0 -3 * *");
        Assertions.assertEquals(0, result);
    }

    @Test
    public void shouldCalculateSubtractionOfPositiveNumbers() {
            int result = priceCalculator.calculatePolishNotation("100   20 1 2  - - -  ");
        Assertions.assertEquals(79, result);
    }

    @Test
    public void shouldCalculateSubtractionOfNegativeNumbers() {
        int result = priceCalculator.calculatePolishNotation("-1 -2 -");
        Assertions.assertEquals(1, result);
    }

    @Test
    public void shouldCalculateAdditionOfPositiveNumbers() {
        int result = priceCalculator.calculatePolishNotation("5 5 +");
        Assertions.assertEquals(10, result);
    }

    @Test
    public void shouldCalculateAdditionOfNegativeNumbers() {
        int result = priceCalculator.calculatePolishNotation("-1 -2 +");
        Assertions.assertEquals(-3, result);
    }

    @Test
    public void shouldCalculateAdditionOfDifferentNumbers() {
        int result = priceCalculator.calculatePolishNotation("-100 0 100 1 + - *");
        Assertions.assertEquals(10100, result);
    }
}

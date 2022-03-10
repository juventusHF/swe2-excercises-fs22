package ch.juventus.javadoc;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    private MathUtils mathUtils;

    @BeforeEach
    public void setup() {
        mathUtils = new MathUtils();
    }

    @Test
    public void fivePlusFiveShouldEqualsTen() {
        // given
        List<Double> numbers = new ArrayList<>();
        numbers.add(5d);
        numbers.add(5d);
        // when
        double result = mathUtils.addition(numbers);
        // then
        assertEquals(10d, result, "Calculation result wrong");
    }

    @Test
    public void testAdditionWithThreeEntryList() {
        // given
        List<Double> numbers = new ArrayList<>();
        numbers.add(5d);
        numbers.add(6.5d);
        numbers.add(9.5d);
        // when
        double result = mathUtils.addition(numbers);
        // then
        assertEquals(21d, result, "Calculation result wrong");
    }

    @Test
    public void testAdditionWithSingleEntryList() {
        // given
        List<Double> numbers = new ArrayList<>();
        numbers.add(5d);
        // when
        double result = mathUtils.addition(numbers);
        // then
        assertEquals(5d, result, "Calculation result wrong");
    }

    @Test
    public void testAdditionWithZeroEntryList() {
        // given
        List<Double> numbers = new ArrayList<>();
        // when
        double result = mathUtils.addition(numbers);
        // then
        assertEquals(0d, result, "Calculation result wrong");
    }

    @Test
    public void additionWithNullParameterShouldThrowNullPointer() {
        assertThrows(
                NullPointerException.class,
                () -> mathUtils.addition(null),
                "Did not throw exception"
        );
    }

    @Test
    public void tenMinusTwoShouldEqualsEight() {
        // when
        double result = mathUtils.subtraction(10d, 2d);
        // then
        assertEquals(8d, result, "Calculation result wrong");
    }

    @Test
    public void zeroMinusFiveShouldEqualMinusFive() {
        // when
        double result = mathUtils.subtraction(0d, 5d);
        // then
        assertEquals(-5d, result, "Calculation result wrong");
    }

    @Test
    public void minusTenMinusFiveShouldEqualMinusFifteen() {
        // when
        double result = mathUtils.subtraction(-10d, 5d);
        // then
        assertEquals(-15d, result, "Calculation result wrong");
    }

    @Test
    public void minusTenMinusMinusFiveShouldEqualMinusFive() {
        // when
        double result = mathUtils.subtraction(-10d, -5d);
        // then
        assertEquals(-5d, result, "Calculation result wrong");
    }

    // todo multiplication tests
    // todo division tests

}
package tests.util;

import main.util.Amount;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AmountTest {
  
    @Test
    void testSubtract() {
        double amount1 = 10;
        double amount2 = 3;
        Amount operand1 = new Amount(amount1);
        Amount operand2 = new Amount(amount2);
        Amount expResult = new Amount(amount1 - amount2);
        Amount result = operand1.subtract(operand2);
        assertEquals(expResult, result, "Wrong difference");
    }

    @Test
    void testSubtractNegativeResult() {
        double amount1 = 10;
        double amount2 = 3;
        Amount operand1 = new Amount(amount1);
        Amount operand2 = new Amount(amount2);
        Amount expResult = new Amount(amount2 - amount1);
        Amount result = operand2.subtract(operand1);
        assertEquals(expResult, result, "Wrong difference");
    }

    @Test
    void testSubtractWithNegativeNumbers() {
        double amount1 = -10;
        double amount2 = -5;
        Amount operand1 = new Amount(amount1);
        Amount operand2 = new Amount(amount2);
        Amount expResult = new Amount(amount2 - amount1);
        Amount result = operand2.subtract(operand1);
        assertEquals(expResult, result, "Wrong difference");
    }

    @Test
    void testAdd() {
        double amount1 = 10;
        double amount2 = 3;
        Amount operand1 = new Amount(amount1);
        Amount operand2 = new Amount(amount2);
        Amount expResult = new Amount(amount1 + amount2);
        Amount result = operand1.add(operand2);
        assertEquals(expResult, result, "Wrong summary");
    }

    @Test
    void testAddNegativeNumbers() {
        double amount1 = -10;
        double amount2 = -3;
        Amount operand1 = new Amount(amount1);
        Amount operand2 = new Amount(amount2);
        Amount expResult = new Amount(amount1 + amount2);
        Amount result = operand1.add(operand2);
        assertEquals(expResult, result, "Wrong summary");
    }

    @Test
    void testAddNumbersWithSumOfZero() {
        double amount1 = 3;
        double amount2 = -3;
        Amount operand1 = new Amount(amount1);
        Amount operand2 = new Amount(amount2);
        Amount expResult = new Amount(amount1 + amount2);
        Amount result = operand1.add(operand2);
        assertEquals(expResult, result, "Wrong summary");
    }

    @Test
    void testMultiply() {
        double amount1 = 3;
        double amount2 = 5;
        Amount operand1 = new Amount(amount1);
        Amount operand2 = new Amount(amount2);
        Amount expResult = new Amount(amount1 * amount2);
        Amount result = operand1.multiply(operand2);
        assertEquals(expResult, result, "Wrong product");
    }

    @Test
    void testMultiplyWithOneNegativeNumber() {
        double amount1 = 3;
        double amount2 = -5;
        Amount operand1 = new Amount(amount1);
        Amount operand2 = new Amount(amount2);
        Amount expResult = new Amount(amount1 * amount2);
        Amount result = operand1.multiply(operand2);
        assertEquals(expResult, result, "Wrong product");
    }

    @Test
    void testMultiplyWithTwoNegativeNumbers() {
        double amount1 = -3;
        double amount2 = -5;
        Amount operand1 = new Amount(amount1);
        Amount operand2 = new Amount(amount2);
        Amount expResult = new Amount(amount1 * amount2);
        Amount result = operand1.multiply(operand2);
        assertEquals(expResult, result, "Wrong product");
    }

    @Test
    void testMultiplyWithZero() {
        double amount1 = 3;
        double amount2 = 0;
        Amount operand1 = new Amount(amount1);
        Amount operand2 = new Amount(amount2);
        Amount expResult = new Amount(amount1 * amount2);
        Amount result = operand1.multiply(operand2);
        assertEquals(expResult, result, "Wrong product");
    }

    @Test
    public void toStringPositiveNumber() {
        double stringNumber = 20;
        Amount amount = new Amount(stringNumber);
        String expResult = Double.toString(stringNumber);
        String result = amount.toString();
        assertEquals(expResult, result, "Strings doesn't match");
    }

    @Test
    public void toStringNegativeNumber() {
        double stringNumber = -20;
        Amount amount = new Amount(stringNumber);
        String expResult = Double.toString(stringNumber);
        String result = amount.toString();
        assertEquals(expResult, result, "Strings doesn't match");
    }

    @Test
    public void toStringZeroNumber() {
        double stringNumber = 0;
        Amount amount = new Amount(stringNumber);
        String expResult = Double.toString(stringNumber);
        String result = amount.toString();
        assertEquals(expResult, result, "Strings doesn't match");
    }    
}

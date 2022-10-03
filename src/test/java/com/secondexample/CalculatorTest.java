package com.secondexample;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
    
    /**
     * Case 1: Both numbers have a non-prime GCD.
    */
    @Test
    public void GCDTest1() {

        // Arrange
        Calculator calc = new Calculator();
        int a = 100;
        int b = 75;

        // Act
        int gcd = calc.GCD(a, b);

        // Assert
        assertEquals( "GCD of 100 and 75 should be 25.", 25, gcd );
    }

    /**
     * Case 2: One of the arguments is a prime number.
     */
    @Test
    public void GCDTest2() {

        // Arrange
        Calculator calc = new Calculator();
        int a = 73;
        int b = 25;

        // Act
        int gcd = calc.GCD(a, b);

        // Assert
        assertEquals( 1, gcd );
    }

    /**
     * Case 3: Both arguments are prime numbers
     */
    @Test
    public void GCDTest3() {

        // Arrange
        Calculator calc = new Calculator();
        int a = 73;
        int b = 67;

        // Act
        int gcd = calc.GCD(a, b);

        // Assert
        assertEquals( 1, gcd );
    }

    /**
     * Case 4: the first argument is prime, the other is zero
     */
    @Test
    public void GCDTest4() {

        // Arrange
        Calculator calc = new Calculator();
        int a = 73;
        int b = 0;

        // Act
        int gcd = calc.GCD(a, b);

        // Assert
        assertEquals( "The GCD for two numbers, where one is zero and the other is non-zero, is to return the non-zero argument.", 73, gcd );
    }

    /**
     * Case 5: the second argument is prime, the other is zero
     */
    @Test
    public void GCDTest5() {

        // Arrange
        Calculator calc = new Calculator();
        int a = 0;
        int b = 73;

        // Act
        int gcd = calc.GCD(a, b);

        // Assert
        assertEquals( "The GCD for two numbers, where one is zero and the other is non-zero, is to return the non-zero argument.", 73, gcd );
    }

    /**
     * Case 6: Both arguments are zero
     */
    @Test(expected = IllegalArgumentException.class)
    public void GCDTest6() {

        // Arrange
        Calculator calc = new Calculator();
        int a = 0;
        int b = 0;

        // Act
        calc.GCD(a, b);
    }

    /**
     * Case 7: two negative arguments
     */ 
    @Test
    public void GCDTest7() {

        // Arrange
        Calculator calc = new Calculator();
        int a = -64;
        int b = -48;

        // Act
        int gcd = calc.GCD(a, b);

        // Assert
        assertEquals( "The GCD of two numbers is equal to the GCD of their absolute values. Therefore, the answer should be positive.", 16, gcd );
    }
}

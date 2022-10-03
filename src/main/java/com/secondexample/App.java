package com.secondexample;

public class App 
{

    public static void main( String[] args )
    {
        
        // Create calculator
        Calculator calc = new Calculator();

        // Do example operation
        int gcd = calc.GCD(12, 9);

        // Print result
        System.out.println( gcd );
    }
}

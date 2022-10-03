package com.secondexample;

public class Calculator {

    /**
     * Calculates the Greatest Common Divisor for the two arguments.
     * @param a the first argument.
     * @param b the second argument
     * @return the greatest common divisor of the two arguments.
     */
    public int GCD( int a, int b ) {

        // Make sure both arguments are positive
        if ( a < 0 )
            a = -a;
        
        if ( b < 0 )
            b = -b;

        // Edge-case: one of the arguments is zero.
        // We want 'a' to be the non-zero argument and 'b' to be the zero argument.
        if ( a == 0 ) {
            int temp = b;
            b = a;
            a = temp;
        }

        // Edge-case: If both arguments are zero, the GCD is undefined, therefore throw exception
        if ( a == 0 )
            throw new IllegalArgumentException( "GCD of 0 and 0 is undefined." );

        // Edge-case: Only one of the arguments is zero, and the other is non-zero
        if ( b == 0 )
            return a;

        if ( a > b )
            return GCD( a - b, b );

        else if ( b > a )
            return GCD( a, b - a );

        else
            return a;
    }
}
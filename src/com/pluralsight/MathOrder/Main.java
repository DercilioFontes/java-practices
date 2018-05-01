package com.pluralsight.MathOrder;

public class Main {

    public static void main (String[] args) {

        int valA = 21;
        int valB = 6;
        int valC = 3;
        int valD = 1;

        int result1 = valA - valB / valC;

        int result2 = (valA - valB) / valC;

        System.out.println( "Result 1: " + result1 );
        System.out.println( "Result 2: " + result2 );

        int result3 = valA / valC * valD + valB;
        int result4 = valA / (valC * (valD + valB));

        System.out.println( "Result 3: " + result3 );
        System.out.println( "Result 4: " + result4 );

        // Type Conversion

        // Implicit type conversion
        int iVal = 50;
        long lVal = iVal;
        System.out.println(lVal);

        // Explicit type conversion
        long lVal2 = 50;
        int iVal2 = (int) lVal2;
        System.out.println(iVal2);
    }
}

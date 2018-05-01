package com.pluralsight.TypeConversion;

public class Main {

    public static void main(String[] args) {

        float floatVal = 1.0f;
        double doubleVal = 4.0d;
        byte byteVal = 7;
        short shortVal = 7;
        long longVal = 5;

        short result1 = byteVal;
        short result2 = (short) longVal;
        short result3 = (short) (byteVal - longVal);
        float result4 = longVal - floatVal;
        double result5 = longVal - doubleVal;
        long result6 = (long) (shortVal - longVal + floatVal + doubleVal);

        System.out.println("Success");
    }
}

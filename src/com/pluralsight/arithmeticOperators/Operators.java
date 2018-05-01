package com.pluralsight.arithmeticOperators;

public class Operators {

    public static void main(String[] args) {

        System.out.println("Add:");
        System.out.println("1.0 + 2.0 = " + (1.0 + 2.0));
        System.out.println("1 + 2 = " + (1 + 2));

        System.out.println("Subtract:");
        System.out.println("5.0 - 4.0 = " + (5.0 - 4.0));
        System.out.println("5 - 4 = " + (5 - 4));

        System.out.println("Multiply:");
        System.out.println("4.0 * 2.0 = " + (4.0 * 2.0));
        System.out.println("4 * 2 = " + (4 * 2));

        System.out.println("Divide:");
        System.out.println("13.0 / 5.0 = " + (13.0 / 5.0));
        System.out.println("13 / 5 = " + (13 / 5));

        System.out.println("Modulus:");
        System.out.println("13.0 % 5.2 = " + (13.0 % 5.2));
        System.out.println("13 % 5 = " + (13 % 5));


        // Prefix / Postfix Operators

        int myVal = 5;
        System.out.println(myVal); // 5
        System.out.println(++myVal); // 6
        System.out.println(myVal); // 6
        System.out.println(myVal++); // 6
        System.out.println(myVal); // 7


    }
}

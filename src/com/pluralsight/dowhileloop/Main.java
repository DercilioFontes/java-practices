package com.pluralsight.dowhileloop;

public class Main {

    public static void main(String[] args) {

        int iVal = 150;

        do {
            System.out.print(iVal);
            System.out.print(" * 2 = ");
            iVal *= 2;
            System.out.println(iVal);
        } while(iVal < 100);
    }
}

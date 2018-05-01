package com.pluralsight.getorganized;

public class Main {

    public static void main(String[] args) {

        // Variables

        int myVar;
        myVar = 50;
        System.out.println(myVar);

        int anotherVar = 100;
        System.out.println(anotherVar);

        myVar = anotherVar;
        System.out.println(myVar);

        anotherVar = 200;
        System.out.println(anotherVar);


        // Integer types

        byte numberOfEnglishLetters = 26;
        System.out.println(numberOfEnglishLetters);

        short feetInAMile = 5283;
        System.out.println(feetInAMile);

        int milesToSun = 92960000;
        System.out.println(milesToSun);

        long nationalDebt = 18100000000000L;
        System.out.println(nationalDebt);

        // Floating Point Types

        float milesInAMarathon = 26.2f;
        System.out.println(milesInAMarathon);

        double atomWidthInMeters = 0.0000000001d;
        System.out.println(atomWidthInMeters);


        // Character and Boolean Types

        char regularU = 'U';
        System.out.println(regularU);
        char accentedU = '\u00DA'; // Ú
        System.out.println(accentedU);

        boolean iLoveJava = true;
        System.out.println(iLoveJava);
    }
}

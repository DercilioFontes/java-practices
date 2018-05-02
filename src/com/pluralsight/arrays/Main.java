package com.pluralsight.arrays;

public class Main {

    public static void main(String[] args) {

//        float[] theVals = new float[3];
//        theVals[0] = 10.f;
//        theVals[1] = 20.0f;
//        theVals[2] = 15.0f;

        float[] theVals = { 10.0f, 20.0f, 15.0f };

        float sum = 0.0f;

//        for (int i = 0; i < theVals.length ; i++)
//            sum += theVals[i];

        for (float currentVal : theVals)
            sum += currentVal;

        System.out.println(sum);

    }
}

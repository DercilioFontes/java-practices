package com.pluralsight.classes;

public class Main {

    public static void main(String[] args) {

//        Flight flight1 = new Flight();
//        flight1.add1Passenger();
//
//        System.out.println();

        Flight lax1 = new Flight();
        Flight lax2 = new Flight();

        // add passengers to both flights

        Flight lax3;
        if (lax1.hasRoom(lax2))
            lax3 = lax1.createNewWithBoth(lax2);
    }
}

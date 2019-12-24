package day06;

import java.util.Scanner;

public class UsingTheValueOfOtherVariables {

    public static void main(String[] args) {

        int myFavoriteNumber = 300;
        int yourFavoriteNumber = myFavoriteNumber;

        System.out.println("My favorite number is " + myFavoriteNumber);
        System.out.println("Your favorite number " + yourFavoriteNumber);

        yourFavoriteNumber = 100;
        System.out.println("My favorite number " + myFavoriteNumber);
        System.out.println("My favorite number " + yourFavoriteNumber);

        String yourOrder = "Gucci bag ";
        String myOrder = yourOrder;

        System.out.println("Your order is " + yourOrder + "\n " +
                "My order is " + myOrder);



    }
}

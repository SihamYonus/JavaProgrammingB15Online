package day05;

import java.util.Scanner;

public class GroceryActions {
    /*
    Task 5 : Grocery Shopping
    *  ask user whats the price of tomato and store it
       ask user how many tomato you want yo buy and store it
    *  ask user whats the price of tomato and store it
       ask user how many potato you want to buy and store it
    *  ask user whats the price of banana and store it
       ask user how many banana you want to buy and store it
        assume that he works 2080 hour for a year.
    * */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("what is the price for potato");
        float potatoPrice = scan.nextFloat();
        System.out.println("How many you want to buy ? ");
        int potatoCount = scan.nextInt();
        System.out.println("Your total for potato is " + (potatoPrice *potatoCount) );

    }
}

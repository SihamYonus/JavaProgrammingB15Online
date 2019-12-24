package day16;

import java.util.Scanner;

public class GiveMe5 {

    public static void main(String[] args) {

        // i want to ask user to enter a number
        // i will keep asking until user actually enter number 5

        Scanner scan = new Scanner(System.in);
//        System.out.println("GIVE ME FIVE!!!!");
////        int userName = scan.nextInt();
////
////        if (userName != 5){
////            System.out.println("Hey you didnt give me 5!!!");
////        }

        int userName = 0;

        while (userName != 5){

            System.out.println("GIVE ME FIVE!!!");
            userName = scan.nextInt();
        }
        System.out.println("End of the Program");

    }
}

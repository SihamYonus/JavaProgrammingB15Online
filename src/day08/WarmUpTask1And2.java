package day08;

import java.util.Scanner;

public class WarmUpTask1And2 {

    public static void main(String[] args) {

        /**
         * Voting Eligibility Program
         *
         * Create a variable called age as int
         *
         * Check whether this age is more than 18
         * if yes print: you are ready to vote!!!
         * if it's less 18 print wait until you are 18
         *
         * */

        /*
         * Create a program to guess you fav number
         * create a variable called myFavoriteNumber as int
         *  Ask user to guess your fav number
         *  if user guessed right 15 then print BINGO!!
         *  if not print try again later
         *
         **/

        int age = 21;
        System.out.println(age >= 18);

        if (age >= 18) {
            System.out.println("You are ready to vote !!!");

        } else {
            System.out.println("Wait until you are 18! ");

        }

        //Task 2

        Scanner scan = new Scanner(System.in);


        System.out.println("Guess my favorite number :");
        int myFavoriteNumber = scan.nextInt();

        if (myFavoriteNumber == 15) {

            System.out.println("BINGO!!!");
        }else {
            System.out.println("YOU ARE NOT MY BEST FRIEND , TRY AGAIN");
        }
        }
    }


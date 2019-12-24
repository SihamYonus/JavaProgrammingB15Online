package day06;

import  java.util.Scanner;

public class ScannerCapturingMultipleWord {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name ? ");
        // nextLine method of Scanner is used to capture whole

        String name = scan.nextLine();

        System.out.println("You have entered " + name);


        System.out.println("Which city do you live in ? ");
        String cityAndState  = scan.nextLine();
        System.out.println("Your city and state is  " + cityAndState);

        System.out.println("What is your street adress ? ");
        String streetAdress  = scan.nextLine();
        System.out.println("Your street adress is  " + streetAdress);


    }
}

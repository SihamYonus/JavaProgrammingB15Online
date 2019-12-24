package day05;

import java.util.Scanner;

public class TheScannerWay {

    public static void main(String[] args) {


        // ask user for name
        // and capture the result
        //print your name is
        // ask user for birth year
        // and capture the result
        // print the age
        // ask user for height
        // and capture for height
        // print the height

        // create scanner object
        // you can mane the variable whatever you want
        // in below case we are calling it scan
        // Scanner is data type, scan is the name, new Scanner (System.in) is the value

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name ? ");
       // String name = Monsur;
        String name = scan.next();
        System.out.println("Your name is : " + name);

        System.out.println("What is your birth year ? ");
        int birthYear = scan.nextInt();
        int age = 2019 - birthYear;

        System.out.println("Your age is : " + age);

        System.out.println("What is your height ? ");
        double height = scan.nextDouble();
        System.out.println("Your height is : " + height);



    }
}
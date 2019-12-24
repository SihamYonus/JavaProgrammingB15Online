package day15;

import java.util.Scanner;

public class NameChecker {

    public static void main(String[] args) {

        // declare a variable to store your name
        // check whether your name lenght if less than 4
        // if so print short name
        //if it is within 5-10
        //if so print medium name
        //if its more than 11
        //print longer name

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name please");
        String name = scan.next();

        int lengthOfTheName = name.length();


        if (lengthOfTheName <4){
            System.out.println("Short name");
        }else if (lengthOfTheName >4 && lengthOfTheName <11){
            System.out.println("Medium name");
        }else {
            System.out.println("Longer name");
        }


        System.out.println("--------------------");


//        check whether your name has either character a or e
//        if so -->> name contains a or e
//        if not -->> i dont have both a or e in my name

        if (name.contains("a")  || name.contains("e")){
            System.out.println("Name contains a or e");
        }else {
            System.out.println("I dont have both a or e in my name");
        }

//


    }
}

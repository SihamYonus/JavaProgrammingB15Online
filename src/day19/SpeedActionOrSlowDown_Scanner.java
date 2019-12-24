package day19;

import java.util.Scanner;

public class SpeedActionOrSlowDown_Scanner {

    public static void main(String[] args) {

        // this is how we count from 1 to 10

        // for (int i = 1; i <= 10 ; i++) {
        // System.out.println(i + " ");
        //}

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter starting speed and ending speed");

        int start = scan.nextInt(); //5;
        int end = scan.nextInt();   //19;

        System.out.print("You have started at speed--> ");
        if(start<end){
            System.out.println("INCREASING THE SPEED ");
            // I will increase the speed limit till I reach ending speed
        for (int i = start; i <= end; i++) {

            System.out.print(i + " ");
        }

        }else if (start>end){
            System.out.println("DECREASING THE SPEED ");
            // I will decrease the speed limit till I reach the ending speed
            for (int x = start; x > end ; x--) {
                System.out.println(x + " ");
            }
        }else{
            System.out.println("NO ACTION NEEDED!!! SAME SPEED!!!");
        }
    }

}
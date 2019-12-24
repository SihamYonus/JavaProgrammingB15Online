package day10;

import java.util.Scanner;

public class SeasonActionWithScanner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What is the season?");

        String season = scan.next();

        switch (season){

            case "Spring":
                System.out.println("Hike! Easter Nawruz, Blossom");
                break;
            case "Summer":
                System.out.println("Swim, Vacation, BBQ");
                break;
            case "Fall":
            System.out.println(" Black Friday, Hiching Harvest, Halloween, Shopping");
            break;
            case "Winter":
                System.out.println("Snowboarding, Chrismas, New Year");
                break;
            default:
                System.out.println("INVALID");
                break;
        }







    }

}

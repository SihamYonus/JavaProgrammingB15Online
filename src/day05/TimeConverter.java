package day05;

import java.util.Scanner;

public class TimeConverter {
    /*
    Task 3:
    *  Create an interactive program to ask user for day
    *  and generate minute that day have
    * */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println();

        int days = scan.nextInt();
        int minutes = days*1440;

        System.out.println("We have " + minutes + " minutes in " + days + " days. " );











    }
}

package day05;

import java.util.Scanner;

public class WageConverter {
    /*
    Task 4 :
    *  Create an interactive program to ask user for hourly wage
    *  and generate yearly salary
        assume that he works 2080 hour for a year.
    * */

    public static void main(String[] args) {

        Scanner wage = new Scanner(System.in);
        System.out.println("What is your hourly wage ? ");

        int salary = wage.nextInt();
        int hourlyWage = salary*2080;
        System.out.println("My hourly wage is " + salary + " $s. And I work " + hourlyWage + "$s per year. ");





    }
}

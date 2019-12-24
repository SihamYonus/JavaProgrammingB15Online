package day07;

import java.util.Scanner;

public class EmailBuilder {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name, last name, company separated by space : ");

        String firstName, lastName, company, email;
        firstName = scan.next(); //"Siham ";
        lastName = scan.next(); //"Yasin ";
        company = scan.next(); //"Verizon";
        // firstName_lastName@company.com
        email = firstName + "_" + lastName + "@" + company + ".com";

        System.out.println("My name is " + firstName + " " + lastName + " and I work for "
                + company + " and my email is " + email);




    }
}

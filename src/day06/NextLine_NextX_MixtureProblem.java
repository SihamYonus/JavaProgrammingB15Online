package day06;

import java.util.Scanner;

public class NextLine_NextX_MixtureProblem {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name ? ");
        String name = scan.nextLine();
        System.out.println("Your name is " + name);

        System.out.println("What is your age ? ");
        String age = scan.nextLine();
        // String age = scan.nextLine();
        System.out.println("Your age is " + age);

        System.out.println("What is the address");
        String address = scan.nextLine();
        System.out.println("Your address is " + address);


    }


}

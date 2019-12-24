package day14;

import java.util.Scanner;

public class Repl_2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Split:");
        String yesOrNo = scan.next();
        System.out.println("Number of people:");
        int numberOfPeople = scan.nextInt();
        System.out.println("Check amount:");
        double checkAmount = scan.nextDouble();
        System.out.println("Service Quality:");
        String serviceQuality = scan.next();
        double totalTip;

        if (yesOrNo.equalsIgnoreCase("Yes")) {

            System.out.print("Number of people entered: ");
            for (int i = 0; i < numberOfPeople; i++) {
                System.out.print("&");
            }
            System.out.println();


            if (serviceQuality.equalsIgnoreCase("Excellent")) {
                totalTip = (checkAmount * 25) / 100;
                System.out.println("Total to pay:" + (checkAmount + totalTip));
                System.out.println("Total tip:" + totalTip);
                System.out.println("Total per person:" + checkAmount / numberOfPeople);
                System.out.println("Tip per person:" + totalTip / numberOfPeople);
            } else if (serviceQuality.equalsIgnoreCase("Great")) {
                totalTip = (checkAmount * 20) / 100;
                System.out.println("Total to pay:" + (checkAmount + totalTip));
                System.out.println("Total tip:" + totalTip);
                System.out.println("Total per person:" + checkAmount / numberOfPeople);
                System.out.println("Tip per person:" + totalTip / numberOfPeople);
            } else if (serviceQuality.equalsIgnoreCase("Good")) {
                totalTip = (checkAmount * 15) / 100;
                System.out.println("Total to pay:" + (checkAmount + totalTip));
                System.out.println("Total tip:" + totalTip);
                System.out.println("Total per person:" + checkAmount / numberOfPeople);
                System.out.println("Tip per person:" + totalTip / numberOfPeople);
            } else if (serviceQuality.equalsIgnoreCase("Fair")) {
                totalTip = (checkAmount * 10) / 100;
                System.out.println("Total to pay:" + (checkAmount + totalTip));
                System.out.println("Total tip:" + totalTip);
                System.out.println("Total per person:" + checkAmount / numberOfPeople);
                System.out.println("Tip per person:" + totalTip / numberOfPeople);
            } else if (serviceQuality.equalsIgnoreCase("Poor")) {
                totalTip = (checkAmount * 5) / 100;
                System.out.println("Total to pay:" + (checkAmount + totalTip));
                System.out.println("Total tip:" + totalTip);
                System.out.println("Total per person:" + checkAmount / numberOfPeople);
                System.out.println("Tip per person:" + totalTip / numberOfPeople);
            }


        }
    }
}


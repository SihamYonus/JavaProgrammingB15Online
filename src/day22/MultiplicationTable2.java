package day22;

public class MultiplicationTable2 {

    public static void main(String[] args) {

        // this loop is for iterating number from 1 to 10 to get multiple table
        for (int timesTable = 1; timesTable <= 10  ; timesTable++) {
            // I want to know which number i want to get the multiplication table
            System.out.println("Multiplication Table of " + timesTable);
            // this loop will generate multiplication table for one number
            for (int base = 1; base <=12 ; base++) {

                System.out.println(timesTable + " x " + base + " = " + timesTable * base);

            }
        }
    }
}

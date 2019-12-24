package day22;

public class MultiplicationTable {

    public static void main(String[] args) {

        System.out.println("Multiplication Table of 1");
        System.out.println("1 x 1 = " + 1 * 1);
        System.out.println("1 x 2 = " + 1 * 2);
        System.out.println("1 x 3 = " + 1 * 3);

        System.out.println("=======================");


        for (int base = 1; base <= 12 ; base++) {
            //System.out.println("1 x 1" + 1 * 1);
            System.out.println("1 x "+ base +" = " + 1 * base);
        }

        System.out.println("==========================");

        System.out.println("Multiplication Table of 2");
        System.out.println("2 x 1 = " + 2 * 1);
        System.out.println("2 x 2 = " + 2 * 2);
        System.out.println("2 x 3 = " + 2 * 3);

        System.out.println("=======================");


        for (int i = 0; i <= 12 ; i++) {
            System.out.println("2 x " + i + " = " + 2 * i);
        }

        System.out.println("=======================");

        System.out.println("Multiplication Table of 3");
        System.out.println("3 x 1 = " + 3 * 1);
        System.out.println("3 x 2 = " + 3 * 2);
        System.out.println("3 x 3 = " + 3 * 3);

        System.out.println("=======================");


        for (int b = 1; b <=12 ; b++) {
            System.out.println("3 "+ b + " = " + 3 * b);

        }



    }
}

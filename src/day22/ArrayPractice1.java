package day22;

public class ArrayPractice1 {

    public static void main(String[] args) {


        double[] prices = new double[5];

        System.out.println(prices[0]);

        // We ca not print out array variable directly
        // to see what's inside
        System.out.println(prices);

        prices[0] = 2.46   ;
        prices[1] = 12.96  ;
        prices[2] = 992.1  ;
        prices[3] = 500    ;
        prices[4] = 65.123 ;

        System.out.println(prices[0]);
        System.out.println(prices[1]);
        System.out.println(prices[2]);
        System.out.println(prices[3]);
        System.out.println(prices[4]);

        System.out.println("=======================");

         // Task
        // Create a char array that hold all the letters from your first name
        // and assign values using each characters of your first name
        // then print out each character

        char[] firstName = new char[5];
        firstName[0] = 'S';
        firstName[1] = 'i';
        firstName[2] = 'h';
        firstName[3] = 'a';
        firstName[4] = 'm';

        System.out.println(firstName[0]);
        System.out.println(firstName[1]);
        System.out.println(firstName[2]);
        System.out.println(firstName[3]);
        System.out.println(firstName[4]);


        boolean[] yesNo = new boolean[3];
        System.out.println(yesNo[0]);
        System.out.println(yesNo[1]);
        System.out.println(yesNo[2]);

        yesNo[0] = true ;
        yesNo[1] = false;
        yesNo[2] = 10>7 ;

        System.out.println(yesNo[0]);
        System.out.println(yesNo[1]);
        System.out.println(yesNo[2]);




    }
}

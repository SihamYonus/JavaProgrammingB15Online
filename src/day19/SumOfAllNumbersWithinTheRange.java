package day19;

public class SumOfAllNumbersWithinTheRange {

    public static void main(String[] args) {

        // get the sum of numbers from 1 - 10
        // its interesting 1+2+3+4+5+6+7+9+10) what is the total?

        // when we loop from 1 to 10 ;
        int sum = 0 ; // nothing has been added yet so 0

//        sum = sum + 1;  //  1
//        sum = sum + 2;  //  3
//        sum = sum + 3;  //  6
//        sum = sum + 4;  //  10
//        sum = sum + 5;  //  15
//        sum = sum + 6;  //  21
//        sum = sum + 7;  //  28
//        sum = sum + 8;  //  36
//        sum = sum + 9;  //  45
//        sum = sum + 10; // 55

        // ----> sum = sum + 1 ;

        for (int i = 1; i <= 100 ; i++) {
           // System.out.println(i);
            sum = sum + i ;
            System.out.println(sum);
        }

        // Homework

        // Create a program to
        // ask user two number and
        // add numbers within those range

    }
}

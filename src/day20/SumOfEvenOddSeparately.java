package day20;

public class SumOfEvenOddSeparately {

    public static void main(String[] args) {
        // sum of odd numbers and even numbers from 10 - 100 use for loop

        int sumOfEven = 0 ;
        int sumOfOdd  = 0 ;

        for (int i = 10; i <= 100 ; i++) {
            // if its even number add that to sumOfEven
            if (i % 2 == 0) {// if(i % 2 != 0)
                sumOfEven = sumOfEven + i;
                // if its odd number add that to sumOfOdd
            }else {
                sumOfOdd = sumOfOdd + i;
            }
        }
        System.out.println("sumOfOdd = " + sumOfOdd);
        System.out.println("sumOfEven = " + sumOfEven);

    }
}

package day20;

public class SumOfOdd {

    public static void main(String[] args) {

        // Give me the sum of odd numbers from 10 - 100

        int sum = 0 ;

        for (int i = 10; i <= 100 ; i++) {
            if (i % 2 == 1) {// if(i % 2 != 0)
                sum = sum + i;
               // System.out.println(i);
                System.out.println(sum);
            }
        }
        System.out.println("sum = " + sum);
        

    }
}

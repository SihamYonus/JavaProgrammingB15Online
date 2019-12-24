package day26;

public class ArrayTask_NumberTest_Logic1 {

    public static void main(String[] args) {
        /*
        * Given an int int array
        * write a program to test all the elements in this int array are more than 100
         */

        int[] scores = {156,101,76,187,87,110};
        int size = scores.length;
        System.out.println("size = " + size);

        // create a variable called finalResult to store
        // your result of checking if every number in this array is more than 100 or not

        String finalResult = ""; // if all numbers are more than 100 then take it yes, if not make it no

        // LOGIC 1.2 :
        // take each item if it is more than 100, increase the count.
        // in the end if count is equal to array item count the finalResult Yes, answer is NO
        int cntMoreThan100 = 0 ;
        for (int eachNum : scores ){

            if (eachNum > 100){
                cntMoreThan100++;
            }
        }
        System.out.println("cntMoreThan100 = " + cntMoreThan100);
        if (cntMoreThan100 == size){
            finalResult = "YES";
        }else{
            finalResult = "NO";
        }
        System.out.println("finalResult = " + finalResult);


    }
}

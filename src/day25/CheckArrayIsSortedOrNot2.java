package day25;

import java.util.Arrays;

public class CheckArrayIsSortedOrNot2 {

    public static void main(String[] args) {

        //int[] nums = {13, 31, 8, 5, 21, 2};
        int[] nums = {1, 2, 3, 4, 5, 6};
        // CREATE A VARIABLE CALLED isSortedAlready and assign value of true ;
        // I ASSUME THE ARRAY IS ALREADY SORTED
        // AND IF IT'S NOT THEN I CHANGE the value of isSortedAlready to FALSE
        System.out.println("nums = " + Arrays.toString(nums));

        boolean isSortedAlready = true;

        for (int i = 0; i < nums.length-1 ; i++) {
            System.out.println(nums[i] + " " + nums[i+1]);
            //pick first item and compare with second item
            //keep repeating until there is no more item

            //print is item1 is less than item2
            System.out.println(" is " +nums[i] + " less than " + nums[i+1] + " ? " + (nums[i] < nums[i+1]));

            if( ! (nums[i] < nums[i+1]) ){
                System.out.println("ARRAY IS NOT SORTED, NO POINT CHECKING THE REST");
                isSortedAlready = false;
                break;
            }

        }

        System.out.println("isSortedAlready = " + isSortedAlready);






    }
}

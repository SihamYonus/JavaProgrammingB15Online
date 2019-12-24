package day26;

import java.util.Arrays;

public class ReverseAnArrayBySwapping {

    public static void main(String[] args) {


        int[] myNumbers = new int[]{5,3,21,2,1,13,8};
        int size = myNumbers.length;
        int lastIndex = size-1;
        int middleIndex = size/2; // 7/2

        System.out.println(Arrays.toString(myNumbers)  );

        // first and last
        System.out.println( myNumbers[0] + "========" + myNumbers[lastIndex-0]);
        // second and one before last
        System.out.println(myNumbers[1] + "=========" + myNumbers[lastIndex-1]);
        //third  and two before last
        System.out.println(myNumbers[2] + "=========" + myNumbers[lastIndex-2]);


        System.out.println("====loop====");
        //loop this
        for (int x = 0; x < middleIndex; x++) {
                      //first number to swap          second number to swap
            System.out.println("Before swap " + myNumbers[0] + "===" + myNumbers[lastIndex-x]);

            int temp = myNumbers[x];
            myNumbers[x] = myNumbers[lastIndex-x];
            myNumbers[lastIndex-x] = temp;

        }
        System.out.println("After swap complete " + Arrays.toString(myNumbers));








    }
}

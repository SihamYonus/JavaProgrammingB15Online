package day26;

import java.util.Arrays;

public class SwapValue {

    public static void main(String[] args) {
        
        
        String name1 = "Emma";
        String name2 = "Jason";
        
        //name2 should have Emma, name1 should have Jason

        String tempContainer = name1; //Emma
        name1 = name2; // name1 -----> Jason
        name2 = tempContainer; //name ---> Emma

        System.out.println("name1 = " + name1);
        System.out.println("name2 = " + name2);

        // swap the value of first item and last item
        int[] myNumbers = new int[]{10,40,30,7};
        System.out.println("myNumbers = " + Arrays.toString(myNumbers));

        int temp = myNumbers[0];    //temp now has 10
        myNumbers[0] = myNumbers[3];//first item value become 7
        myNumbers[3] = temp;        //last item becomes 10

        System.out.println("First item = " + myNumbers[0]);
        System.out.println("Second item = " + myNumbers[3]);

        System.out.println("myNumbers = " + Arrays.toString(myNumbers));

        int temp2 = myNumbers[1];
        myNumbers[1] = myNumbers[2];
        myNumbers[2] = temp2;
        System.out.println("myNumbers = " + Arrays.toString(myNumbers));

        // the result of swapping -----> reversed array

        // how did I come up with 0 and 3
        // how did I come up with 0+1 and 3-1=2



        
        
        
        
        
        
        
    }
}

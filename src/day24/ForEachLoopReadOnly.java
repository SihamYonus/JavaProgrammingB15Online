package day24;

public class ForEachLoopReadOnly {

    public static void main(String[] args) {

        int yourFavNumber = 300 ;
        int myFavNumber = yourFavNumber;

        myFavNumber = 299 ;
        System.out.println(yourFavNumber);


        long[] nums = {10,40,20};
        // how to i change double my first item in the array
        //nums[0]= nums[0] * 2;//nums[0]*=2
        //System.out.println(nums[0]);

        for (int i = 0; i < 3; i++) {
            //System.out.println(nums[i] * 2);
            long eachItem = nums[i];
            eachItem = 100 ;
            //nums[i] = nums[i] * 2 // here we are doubling the value of each item
        }

        for (long eachItem : nums){
            eachItem = 100;
        }
        //NEVER USE FOR EACH LOOP TO MODIFY ARRAY ITEMS




        // how do i know array items are modified or not re-print

        System.out.println("AFTER WE MODIFY THE VALUE");
        for (int i = 0; i < 3; i++) {
            System.out.println(nums[i]);
        }

    }
}

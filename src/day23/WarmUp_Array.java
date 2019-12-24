package day23;

public class WarmUp_Array {

    public static void main(String[] args) {

        // create an int array of 7 items
        // assign values
        // print out in reverse
        // store last item in a variable called lastItem
                // print it out separately
        // print the item right in the middle
        // find sum, average, max and min

        int[]item = new int[7];
        // first way to create an array object and add value into index location
        item[0] = 2;
        item[1] = 4;
        item[2] = 6;
        item[3] = 8;
        item[4] = 10;
        item[5] = 12;
        item[6] = 14;

        // 2nd way to create an array with values already filled
        int[]num = new int[]{2,4,6,8,10,12,14};

        // 3rd and shortest way just do it directly
        // THIS MUST HAPPEN IN ONE LINE, WE CAN NOT DECLARE FIRST AND ASSIGN LATER
        int[] num2 = {2,4,6,8,10,12,14};

        for (int i = item.length-1; i >= 0 ; i--) {
            System.out.println("Item = " + item[i]);
        }

        int arraySize = item.length;
        int lastItemIndex = arraySize-1;

        int lastItemValue = item[lastItemIndex];

        System.out.println("Last item value = " + lastItemIndex);

        // To find middle value
        int middleItemIndex = arraySize/2;
        System.out.println("Middle Item value = "+item[middleItemIndex]);


        // To find sum
        int sum = 0 ;
        for (int i = 0; i < arraySize; i++) {

            int currentItem = item[i];
            sum = sum + currentItem ;

        }
        System.out.println("sum = " + sum);


    }
}

package day22;

public class ArrayCreation2 {

    public static void main(String[] args) {

        // Another way of creating an array

        int [] ages = new int[]{3,5,11,33,57,18};

        int itemCount = ages.length;
        System.out.println("itemCount = " + itemCount);

        for (int i = 0; i < itemCount; i++) {
            System.out.print(ages[i]+ " ");
        }

        System.out.println("=========================");

        int[]areaCode = {703, 300, 954, 665};
        // if you do it this way: IT MUST HAPPEN IN ONE LINE TOGETHER
        for (int i = 0; i < areaCode.length ; i++) {
            System.out.print(areaCode[i] + " ");
        }



    }
}

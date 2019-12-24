package day22;

public class LoopingThroughAnArray {

    public static void main(String[] args) {

        int []scores = new int[4];
        scores[0] = 95 ;
        scores[1] = 70 ;
        scores[2] = 88 ;
        scores[3] = 100 ;

        System.out.println(scores[0] );
        System.out.println(scores[1] );
        System.out.println(scores[2] );
        System.out.println(scores[3] );

        System.out.println("=================");


        // how do we get the size of any array object
        // array object has a property called length
        int itemCount = scores.length;
        int lastItemIndex = itemCount-1;


       // for (int i = 0; i <= lastItemIndex; i++) {
       // for (int i = 0; i <= itemCount-1 ; i++) {
        for (int i = 0; i < itemCount; i++) {
            System.out.println(scores[i]);
        }

        System.out.println("=================");


        // print this array in reverse order
        int elementCount = scores.length; // 4
        int lastItemIndex1 = elementCount-1;// 3

        for (int x =lastItemIndex1; x >= 0 ; x--) {
            System.out.println("Index location "+ x);
            System.out.println(scores[x]);
        }

        // how to we get char count of a String
        String name = "Jon Snow";
        int charCount = name.length();


    }
}

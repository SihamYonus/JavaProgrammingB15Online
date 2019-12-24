package day22;

import org.w3c.dom.ls.LSOutput;

public class ArrayIntro {

    public static void main(String[] args) {

        // syntax for creating variable to store single item and assigning value
        // dataType variableName = value here

        int num1 = 10;

        // syntax for creating a variable to store multiple items and assign values
        // dataType [] variableName = new dataType[count of item]
        // this array can hold 4 items, its also known as array size
        // creating an array object with empty space

        int []scores = new int[4];
        // assigning value to each index
        scores[0] = 95 ;
        scores[1] = 70 ;
        scores[2] = 88 ;
        scores[3] = 100 ;

        // accessing the element inside array one by one
        System.out.println(scores[0] );
        System.out.println(scores[1] );
        System.out.println(scores[2] );
        System.out.println(scores[3] );

        // updating the value at certain index
        scores[1] = 99;
        System.out.println(scores[1]);

        // Once array is created with certain size, we CANNOT CHANGE THE SIZE!!!

        // When you create new array object
        // it will get default value in each element
        int [] numbers = new int[3];
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        //Task

        // create a byte array with size 4
        byte[] data= new byte[4];

        // assign value for each index location
        data[0] = 45 ;
        data[1] = 67 ;
        data[2] = 78 ;
        data[3] = 89 ;

        // print out the values at each index
        System.out.println( data[0]);
        System.out.println( data[1]);
        System.out.println( data[2]);
        System.out.println( data[3]);

        // update last index value
        data[3]= 95 ;
        System.out.println(data[3]);



    }
}

package day06;


import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class Remainder {

    public static void main(String[] args) {
        // + - * /
        // %

        System.out.println(5/2);
        System.out.println(5.0/2);
        System.out.println(5.0/2f);

        System.out.println("-----modulus----");

        // 5 divided by 2 is 2 and the remainder is 1
        // 2*2 + 1 = 5
        System.out.println( 5 % 2 );
        // 10*9 + 9 = 99
        System.out.println( 99 % 10 );
        // 10*10 + 0 = 100
        System.out.println( 100 % 10 );

        // declare a variable called minutes, data type int
        // ask user to enter minutes as whole number
        //print the result in x hour y minutes format
        // for example 135 minutes , 2 hrs 15 minutes

        int minutes = 135;
        int hourPart = 135 / 60;
        int minsPart = 135 % 60;

        System.out.println("The minutes " + minutes + "is "
                + hourPart + "hours and " + minsPart + "minutes ");



    }






}

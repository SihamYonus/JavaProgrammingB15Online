package day17;

import java.util.Scanner;

public class PrimeNameWithOddIndexes {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("ENTER YOUR NAME");
        String name = scan.nextLine();

        int x = 0 ;
        // x<= name.lenght()-1 meaning :
        // starting from 0 until las index

        // x < name.lenght() meaning:
        //starting from

        while (x < name.length()){

            if(x%2 == 1){
                System.out.println(name.charAt(x));
            }
            ++x;
        }
    }
}

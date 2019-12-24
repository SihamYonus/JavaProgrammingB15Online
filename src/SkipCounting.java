public class SkipCounting {

    public static void main(String[] args) {


        // Skip counting by 3 from 0 till 30
        // 3 6 9 12 15 18 21 24 27 30

        int counter = 0 ;
        while (counter < 30){
            //counter += 3 ;
            counter = counter + 3;
            System.out.print(counter + " ");
        }

        System.out.println("--------------");

        // write a program to print out even number from 0 till 50;
        // write a program to print out odd number from 0 till 50;

        //even munber
        int number = 0 ;
        while ( number <= 50){
            number += 2;
            System.out.print(number + " ");
        }

        System.out.println("----------------");

        //odd number
        int number2 = 1 ;
        while (number2 <= 50){
            System.out.print(number2 + " ");
            number2 += 2;
        }

        System.out.println("-----------------");

        int number3 = 0;

        while (number3 <= 50) {

            if (number3 % 2 == 0) {
                System.out.println(number3 + " is even munber");
            } else {
                System.out.println(number3 + " is odd number");
            }
            ++number3;
        }

    }
}

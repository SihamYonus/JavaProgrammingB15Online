package day19;

public class FindingTheCountOfSomething {

    public static void main(String[] args) {

        // from 1 - 100 print out all numbers that can be divided by 15 without remainder

//        15 is divisible by 15
//        30 is divisible by 15
//        45 is divisible by 15
//        60 is divisible by 15
//        75 is divisible by 15
//        90 is divisible by 15
//        Total numbers divisible by 15 from 1 to 100 is: 6

        // from 1 - 100 count how many numbers can be divided by 15

        int counter = 0 ;

        for (int i = 1; i <=  100 ; i++) {
            if (i % 15== 0){
                System.out.println(i);
                // counter = counter + 1;
                // counter += 1;
                ++counter;
            }
        }
        System.out.println("counter = " + counter);

        // given a string with value
        // find out how many a showed in this string

        String name = "Esra Fidan";


        System.out.println(name.charAt(0)=='a');

        for (int x = 0 ; x < name.length() ; x++) {
            System.out.println( name.charAt( x ));
            if (name.charAt( x ) == 'a'){
                System.out.println("BINGO FOUND IT!!!");
            }

        }

        System.out.println("-------------------");

               // Another Way

        int countOfA = 0;
        for (int x = 0 ; x < name.length() ; x++) {
            //System.out.println( name.charAt( x ));
            if (name.charAt( x ) == 'a'){
            //    System.out.println("BINGO FOUND IT!!!");
                ++countOfA;
            }

        }





    }
}

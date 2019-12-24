package day17;

public class FizzBuzzTest {

    public static void main(String[] args) {

        // if a number can be divided by both 3 and 5---->? Fizz Buzz number
        // if a number can be divided by 5-----> Fizz number
        // if a number can be divided by 3----->Buzz number

        int number = 14 ;

        if (number%5==0 && number%3==0){
            System.out.println(number + " is Fizz Buzz number");
        }else if (number%5==0){
            System.out.println(number + " is Fizz number" );
        }else if (number%3==0){
            System.out.println(number + " is Buzz number");
        }


        int num = 1;
        while(num <= 100){

            if (num%5==0 && num%3==0){
                System.out.println(num + " is Fizz Buzz number");
            }else if (num%5==0){
                System.out.println(num + " is Fizz number" );
            }else if (num%3==0){
                System.out.println(num + " is Buzz number");
            }

            ++num;


        }

    }
}

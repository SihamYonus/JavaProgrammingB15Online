package day10;

public class Answer {

    public static void main(String[] args) {

        /* Create a class called Answer with main
        Create a variable called myAnswer as String with value of string
        Create a variable called myNumber and assign any value
        If the number can divided by 5 without remainder
        Assign myAnswer value to Fizz Number
        If not assign the value to not Fizz Number
        Outside if else statement:
        print my number is <>, it is <value of myAnswer here>

         */

        String myAnswer = "" ;
        int myNumber = 30;

        if (myNumber%5 == 0){
            myAnswer = "Fizz number";
        } else {
            myAnswer = "Not Fizz number";
        }

        System.out.println("Print my number is:" + myNumber + ", It is " );
    }
}

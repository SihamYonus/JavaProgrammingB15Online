package day05;

public class VariablePractice {

    public static void main(String[] args) {

        // 8 primitive
        /*
          Block comment , everything in between will be seen as comment
          whole numbers         : byte , short , int , long
          fractional numbers    : float , double
          logical               : boolean (true , false)
          character             : char (single character in single quote)
        usually by default for whole numbers :  just use int
        usually by default for fractional numbers :  just use double
        IS String part of Primitive types ?  : NOOO!!!!!
        String is sequence of character
        */
        // Task 1: Age calculator
        // given birth year , please calculate the age
        int birthYear = 2001;
        int currentYear = 2019-birthYear;
        // I was born in year 2001 , and I am 18 years old ;

        System.out.println("I was born in year " + birthYear + " , and I am " + currentYear + " years");



    }
}

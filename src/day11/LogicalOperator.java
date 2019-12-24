package day11;

public class LogicalOperator {

    public static void main(String[] args) {

        // combing multiple condition together

        // in java there is no range check directly like math
        // for example
        // in maths : 60 < x < 100 -----> true < 100
        // In java :  x > 60 && x <100

        // &&  2 ampersand & 1 ampersand  -----> logical And Operator
          // This is used to check both conditions are true at the same time

        // Think about login example
        // only when your username is right and the password is right at the same time
        // then you will be able to log in

        /*
                          true     false
        * int x = 70; x > 60 && x <100 ; True

                          false    true
        * int x = 10; x > 60 && x <100 ; False

                          true     false
        * int x = 110; x > 60 && x <100 ; false

                          true      true
        * int x = 99; x > 60 && x <100 ; true

         **/


        /* || 2 pipe or | 1 pipe is used for compiling 2 conditions : Logical Or Operator

        If you have 2 conditions to check
        when will this be true : As long as one side is true , whole result will be true
        // think about buying milk from 2 stores :

         */

        /*                true       false
          * int x = 70; x > 10 || x < 5 ; True

                          false       false
          * int x = 7; x > 10 || x < 5 ; True

                           true        false
          * int x = 17; x > 10 || x < 5 ; True

         */

    }
}

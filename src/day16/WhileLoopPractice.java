package day16;

public class WhileLoopPractice {

    public static void main(String[] args) {


        int x = 100 ;

        while ( x <= 105 ){
            System.out.println("Hello World");
            x++ ; // it will increase the value by 1 next time the x shows up
            //++x // it will increase the value by 1 right away
        }

        /*
        ** iteration 1    100
        * check 100 <= 105 ---> true
        *     "Hello World"
        *        x = 101
        *
        *  iteration 2
        * check 101 <= 105 ---> true
         *     "Hello World"
         *        x = 102
        *  iteration 3
        * check 102 <= 105 ---> true
         *     "Hello World"
         *        x = 103
        *  iteration 4
        * check 103 <= 105 ---> true
         *     "Hello World"
         *        x = 104
        *  iteration 5
        * check 104 <= 105 ---> true
         *     "Hello World"
         *        x = 105
        *  iteration 5
        *
         */




    }

}

package day17;

public class WhileLoopPractice {

    public static void main(String[] args) {

        // --decrease by 1
        // ++ increase by 1

        // count 1 to 5 then count 5 to 1
        int counter = 1;

        while ( counter <= 5 ){
            System.out.print(counter + " ");
            ++counter;
        }

        System.out.println();
        System.out.println("counter = " + counter);

        // now I want to count from 5 to 1 using same counter
        // counter >= 6>= 1 5>= 1 4>= 1 3>= 1 2>= 1 1>= 1 0>= 1 false1!!!
        // counter > 6>1 5>1 4>1 3>1 2>1 true

        while (counter > 1 ){
            --counter;
            System.out.print(counter + " ");
        }

        System.out.println();
        System.out.println("counter after decrement = " + counter);


    }
}

package day21;

public class NestedLoopTask {

    public static void main(String[] args) {

        /*
         * // count from 1 to 10 --> print only odd numbers
         * // repeat this 4 times
         * */

        for (int j = 1; j <= 4; j++) {
            System.out.println("Iteration :" + j);

            for (int i = 1; i <= 10; i++) {

                if (i % 2 == 1) {
                    System.out.print(i + " - ");
                }
            }

            System.out.println();
        }
    }
}
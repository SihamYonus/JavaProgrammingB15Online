package day21;

public class LoopControlStatementBreak {

    public static void main(String[] args) {

        // break
        // if line contains break reaches the loop will stop!!!

//        for (int i = 0; i <= 10 ; i++) {
//            System.out.print(i);
//            break;
//        }

        // while iterating over 1 to 10
        // break out of the loop when its 5

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            if (i == 5) {
                break;
            }

        }

        int sum = 0;
        for (int i = 1; i < 10; i++) {

            System.out.println("Current sum is "+ sum);
            System.out.println("If i add " + i + " dollar, it would be " + (sum + i));

            if (sum + i > 40) {
                break; //BREAKING OUT OF THE LOOP
            }
            sum = sum + i;
        }
        System.out.println("sum = " + sum);

    


    // continue
    // if line contains break reaches the loop will skip to next iteration

    //WE CAN USE BREAK AND CONTINUE FOR ANY TYPE OF LOOP


    }
}
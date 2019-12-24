package day21;

public class LoopControlStatementContinue {

    public static void main(String[] args) {

        // continue
        // if line contains continue reaches, the loopwill skip to next iteration
        // We can use break and continue for any type of loop

        for (int i = 1; i <= 10 ; i++) {
            if (i % 2 == 1){
                continue;
            }
            System.out.println(i);
        }





    }
}

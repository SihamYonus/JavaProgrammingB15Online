package day21;

public class BreakContinue {

    public static void main(String[] args) {

        for (int i = 0; i <=5 ; i++) {
            System.out.println(i);
            //this is pointless
            // after the 5th iteration
            //the loop will stop by itself

            if(i==5){
                break;
            }
            //this is pointless
            //because after each iteration
            //its going to next iteration anyway!
            continue;
        }
    }
}

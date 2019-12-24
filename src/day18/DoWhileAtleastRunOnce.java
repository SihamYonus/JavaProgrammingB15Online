package day18;

public class DoWhileAtleastRunOnce {

    public static void main(String[] args) {

        // WHILE LOOP VS DO WHILE LOOP

        /*
         * while loop check the condition first then enter the statement
         * do while loop will take the action at least once then thr condiotion
         *
         * DO WHILE LOOP ALWAYS RUN AT LEAST ONE IRERATION
         * WHILE LOOP MIGHT NOT EVEN RUN
         */


        int z = 1000 ;
        do{
            System.out.println("KEEP GOING ");

        }while (z < 5 );

        System.out.println("THE END");

        while ( z < 5 ){
            System.out.println("KEEP GOING IN WHILE");
        }
    }
}

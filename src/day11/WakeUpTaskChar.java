package day11;

public class WakeUpTaskChar {

    public static void main(String[] args) {

        /* You have 4 switches in your home to turn on

        A - bedroom
        B - livingroom
        C - kitchenlight
        D - hallway
        Use switch statement

         */

        char A, B, C, D;
        char targetOption = 'C';


            if (targetOption=='A'){
                System.out.println("You have turned on the bedroom light");
            }else if (targetOption=='B'){
                System.out.println("You have turned on the living room light");
            }else if(targetOption=='C'){
                System.out.println("You have turned on the kitchen light");
            }else if (targetOption=='D'){
                System.out.println("You have turned on the hallway light");
            }else {
                System.out.println("Entry Invalid");
            }






        }

    }


package day11;

public class WakeUpTaskIfStatement {

    public static void main(String[] args) {

        /* You have 4 switches in your home to turn on

        BD - bedroom
        Lr - livingroom
        Ki - kitchenlight
        Ha - hallway
        Use switch statement

         */

        String Bd, Lr, Ki, Ha;
        String targetOption = "Bd";


            if (targetOption=="Bd"){
                System.out.println("You have turned on the bedroom light");
            }else if (targetOption=="Lr"){
                System.out.println("You have turned on the living room light");
            }else if(targetOption=="Ki"){
                System.out.println("You have turned on the kitchen light");
            }else if (targetOption=="Ha"){
                System.out.println("You have turned on the hallway light");
            }else {
                System.out.println("Entry Invalid");
            }






        }

    }


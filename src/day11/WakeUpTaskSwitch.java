package day11;

public class WakeUpTaskSwitch {

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
        switch (targetOption){

            case "Bd":
                System.out.println("You have turned on the bedroom light");
                break;
            case "Lr":
                System.out.println("You have turned on the living room light");
                break;
            case "Ki":
                System.out.println("You have turned on the kitchen light");
                break;
            case "Ha":
                System.out.println("You have turned on the hallway light");
                break;
            default:
                System.out.println("Invalid");
                System.out.println("Entry Invalid");
                break;


        }

    }
}

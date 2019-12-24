package day08;

public class MultiBranchIfStatement {

    public static void main(String[] args) {

        //pseudo code
        /*
        * given your currentSpeed, speedLimit
        *
        * check whether the current speed is
        *
        * more than 90 ----> jail
        * more than 80 and less than 90 ----> reckless driving
        *
        * ----- start from here above two optional
        * more than 70  ----> point taken
        * more than 60 and else that 70 ----> warning
        *
        * if not speeding keep driving
        *

         */
//         int currentSpeed = 65 ;
//
//         if(currentSpeed> 70){
//             System.out.println("You are speeding more than 70 point taken!!!");
//         }else if(currentSpeed>60){
//             System.out.println("Your speed is LESS THAN or equal to 70 but more than 60 ");
//         }else {
//             System.out.println("Keep driving you are good ");
//         }


        int currentSpeed = 45 ;


        if(currentSpeed> 60){
            System.out.println("You are speeding more than 70 point taken!!!");
        }else if(currentSpeed>70){
            System.out.println("Your speed is LESS THAN or equal to 70 but more than 60 ");
        }else {
            System.out.println("Keep driving you are good ");
        }
    }
}

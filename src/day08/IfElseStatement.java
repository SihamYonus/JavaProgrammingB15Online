package day08;


public class IfElseStatement {

    public static void main(String[] args) {

        int speedLimit = 60;

        int yourCurrentSpeed = 100;

        // if the yourCurrentSpeed is more than the speed limit
        // get pulled over by the police
        // given ticket by the policy
        // taken away some points on your license
        // go to court

        boolean IAmSpeeding= ( yourCurrentSpeed>speedLimit ) ;

        if (IAmSpeeding){
            System.out.println("get pulled over by the police");
            System.out.println("given ticket by the policy");
            System.out.println("taken away some points on your license");
            System.out.println("go to court");
        }else {
            System.out.println("go shopping!!");
            System.out.println("Buy ice cream");
            System.out.println("Enjoy your day");
        }

        System.out.println("THE END!!!!");

        // if not over the limit
        // go shopping!!

        // outside if statement , say the end

    }


}

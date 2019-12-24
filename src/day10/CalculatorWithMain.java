package day10;

public class CalculatorWithMain {

    public static void main(String[] args) {

        char operator = '+' ;
        switch (operator){

            case '+' :
                System.out.println("You are about to add");
                break;
            case '-':
                System.out.println("You are about to subtract");
                break;
            case '*':
                    System.out.println("You are about to multiply");
                    break;
            case '/':
                System.out.println("You are about to divide");
                break;
            default:
                System.out.println("invalid operator");
                break;


        }


    }
}

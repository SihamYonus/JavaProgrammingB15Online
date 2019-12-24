package day31;

public class MethodPractice3 {

    // Create a class called MethodPractice4

    // no need for object when being called                : static
    // it should be accessible anywhere in your project    : public
    // it does not return any value                        : void
    // does not need any external data when being called   : (nothing inside)

    // Create a method called countDownFrom20tillOne
    // Create a method to print odd numbers from 1-100 : printOddNumbers1to100()
    // Create a method to spell your name :  Seda -->> S-e-d-a


    public static void printOddNumbers1to100() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

    }

    public static void countDownFrom20Till1() {
        for (int x = 20; x >= 0; x--) {
            System.out.print(x + " ");
        }
        System.out.println();

    }
    public static void spellMyName(){

        String name = "Siham";
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i)+ "-");
        }
        System.out.println();
    }



    public static void main(String[] args) {
        countDownFrom20Till1();
        printOddNumbers1to100();
        spellMyName();
    }

    }
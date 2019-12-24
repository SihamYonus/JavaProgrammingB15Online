package day32;

public class CharacterAction {

    public static void main(String[] args) {

        printAtoZ();
        printZtoA();
        printAlphabetInRange('a','f');


    }


    /*
     * printAtoZ
     * create a method that has no parameter
     * and print A-Z in one line
     * */

    public static void printAtoZ() {

        for (char iChar = 'A'; iChar <= 'Z'; iChar++) {
            System.out.print(iChar + " ");
        }
        System.out.println();

    }

    /*
     *printZtoA
     *create a method that has no parameter
     *  and print Z-A in one line
     * */

    public static void printZtoA() {

        for (char xChar = 'Z'; xChar >= 'A'; xChar--) {
            System.out.print(xChar + " ");
        }
        System.out.println();
    }

    /*
    * printAlphabetInRange
    * create a method that have 2 char as parameters: beginning, ending
    * if beginning character is before ending character
    *  for example beginning A , ending D  -->> ABCD
    * if beginning character is after ending character
    * for example beginning D , ending A  -->> DCBA
    * */

    public static void printAlphabetInRange (char beginning, char ending){

        // this mean beginning character comes before ending character
        // in ascii table
        if (beginning<ending) {
            System.out.println("WE NEED TO INCREMENT FROM " + beginning + " till " + ending);
            for (char iChar = beginning; iChar <= ending; iChar++) {
                System.out.print(iChar + " ");
            }
            System.out.println();

            // this mean beginning character comes after ending character
            // in ascii table
        }else if (beginning > ending) {
                System.out.println("WE NEED TO DECREMENT FROM " + beginning + " till " + ending);

        }

        }

    }


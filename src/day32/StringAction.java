package day32;

public class StringAction {

    public static void main(String[] args) {

        //reversePrintMyOwnName();
        printStringWithDashInBetween("Hasan");
        printStringWithDashInBetween("Siham");
        printStringWithDashInBetween("Tokun");



    }
    // printStringWithDashInBetween
    // it has one String parameter called name
    // it will do following in method body
    // print each and every character of a string with dash in between
    // excluding tha last one Akbar -----> A-K-B-A-R
    // keep concatenating after each character when it comes to last character don't add it

    /*
    *reversePrintMyOwnName
    *create a method that has no parameter
	and print your name in reversed order
    * */

    public static void printStringWithDashInBetween(String name) {

        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i));
            if (i != name.length() - 1) {
                System.out.print("-");
            }
        }
        System.out.println();



 //           public static void reversePrintMyOwnName(){
//
//        String name = "Siham";
//        // start from last character and print toward first character
//        for (int i = name.length()-1; i >= 0; i--) {
//            System.out.print(name.charAt(i));
//        }
//        System.out.println();

            }
        }

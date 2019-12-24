package day07;

public class CastingTheCharacter {

    public static void main(String[] args) {

        char grade = 'B';
        System.out.println(grade);

        // 'B' is represented by 66 in ascii table
        // here type chat is automaticallywidened to int and stored as number

        int letterInNumber = 'B';
        System.out.println(letterInNumber);

        int letterInNumber2 = 'b';
        System.out.println(letterInNumber2);

        // -------------------------------

        char myFirstChar = (char)100;
        System.out.println(myFirstChar);

        // find out your number of each character in your first name

        int letter1 = 'S';
        int letter2 = 'I';
        int letter3 = 'H';
        int letter4 = 'A';
        int letter5 = 'M';

        System.out.println(letter1);
        System.out.println(letter2);
        System.out.println(letter3);
        System.out.println(letter4);
        System.out.println(letter5);


    }
}

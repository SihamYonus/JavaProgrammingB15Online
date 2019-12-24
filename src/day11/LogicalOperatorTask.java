package day11;

public class LogicalOperatorTask {

    public static void main(String[] args) {

        // Create a variable called num with type int
        // find out whether this number is more than 100 or less than 10

        // find out the number is within the range of 10-60
        // and print out the result

        int num = 55;
        System.out.println(num>10 && num<100);

        System.out.println(num>10 || num<60);

        // more than 2 conditions at the same time , 3 conditions

        System.out.println( true || false || false);

        System.out.println(true && true && false);

        System.out.println(num>50 && num != 52 || num == 57);



    }
}

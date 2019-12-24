package day06;

public class CompoundOperator {

    public static void main(String[] args) {

        // Assignment Operator =
        // --> will save the result of whatever operation on the right side
        // and assign the result to the left side variable

        int studentOnLine = 263;

        studentOnLine = studentOnLine + 5;

        System.out.println("5 people joined the class " + studentOnLine);

        studentOnLine = studentOnLine - 3;

        System.out.println("3 people left the class " + studentOnLine);

        studentOnLine = studentOnLine * 2;

        System.out.println("The student count doubled " + studentOnLine);

        studentOnLine = studentOnLine / 3;

        System.out.println("The student dropped to 1/3: " + studentOnLine);


    }
}

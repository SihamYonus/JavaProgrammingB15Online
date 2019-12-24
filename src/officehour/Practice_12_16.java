package officehour;

public class Practice_12_16 {

    public static void main(String[] args) {


        String[] names = {"John", "Kevin", "Scott"};
        System.out.println("First name : " + names[0]);

        for (String eachName : names) {
            System.out.println(eachName);
        }

        // Let's say we need to store some table
        // where we have rows and columns
        // student id| name | age | country|

        // 3D is array of arrays of arrays
        String[][] students = {{"1", "John", "35","USA"},
                {"2", "Kevin", "40","Brazil"},
                {"3", "Scott", "20","Canada"}
        };

        System.out.println("How many arrays inside students 2d array? " + students.length);
        System.out.println("How many values in second row(inner array)? " + students[1].length);

        // this loop through inner array
        for (String []arr : students){
            // loop through values in every inner array
            for (String value : arr){
                System.out.print(value+" ");
            }
            System.out.println();
        }

        // find the oldest student and print his name


        // print age values for all students
        for (String[] row : students){
            // goes through every row and get value from 3rd column
            System.out.println(row[2]);
        }




    }
}

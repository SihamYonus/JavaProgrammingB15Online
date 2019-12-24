package day26;

import java.util.Arrays;

public class StringSplitPractice {

    public static void main(String[] args) {

        String students = "Abbos, Zulyar,Zhiber,Hasan,Muge, Orhan,Susan" ;
        // first get all the name into String array called namesArray

        // spell the name of each person in this format
        // A-b-b-o-s-...
        // Z-u-l-y-a-r-...

        //String[] studentsName = {"Abbos", "Zulyar","Zhiber","Hasan","Muge", "Orhan","Susan"};

        students = students.replace(" ","");
        String[] namesArrays = students.split(",");

        System.out.println(Arrays.toString(namesArrays));
        System.out.println("lenght of namesArray1 is "+ namesArrays.length);
        int studentCount = namesArrays.length;

        for (int x = 0; x < studentCount ; x++) {

            String name = namesArrays[x];
            System.out.println("Spelling = " + name);

            for (int i = 0; i < name.length() ; i++) {

                System.out.print(name.charAt(i)+"-");

            }
            System.out.println();


        }








    }
}

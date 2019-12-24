package day17;

public class WakeUpTask {

    public static void main(String[] args) {

        String name = "siham ";


        // get the first character make it uppercase
        // get the rest of the characters starting from 2nd character
        // then make it lower case eventually concatenate them

        // ONE WAY OF DOING IT
//        String nameFixed = (name.charAt(0)+"").toUpperCase();
//               nameFixed= nameFixed + name.substring(1).toLowerCase();
//
//        System.out.println("nameFixed = " + nameFixed);


        // ANOTHER WAY OF DOING IT
        String nameFixed = name.toUpperCase().substring(0,1);
               nameFixed += name.substring(1).toLowerCase();

        System.out.println("nameFixed = " + nameFixed);



      








    }
}

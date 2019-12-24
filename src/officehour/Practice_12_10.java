package officehour;


public class Practice_12_10 {

    public static void main(String[] args) {

        String[] cars = {"bmw","wv","audi"};

        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);

        // for each loop

        // temporary variable : array name
        for (int carsIndex = 0; carsIndex <=2 ; carsIndex++) {
            System.out.println("Here is your car " + cars[carsIndex]);

        }


        for (String carModel : cars){
            System.out.println("I'm done assigning the car " + carModel);

        }
        System.out.println("==================");
        //String carModel : cars
//        carModel = "bmw"
//        carModel = "wv"
//        carModel = "audi"

        System.out.println("==================");
        int[] ages = {23,43,5,7,87};
        // To print out index 2
        System.out.println(ages[2]);

        System.out.println("==================");
        System.out.println(ages[3]-ages[2]);// 2 ages
        //                    (7  -  5)
        //                        2

        System.out.println("==================");
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
        System.out.println(ages[3]);
        System.out.println(ages[4]);

        System.out.println("==================");

        for (int ageOfStudent : ages){
            System.out.println("this student's age is " + ageOfStudent);
            System.out.println("I am done");
        }


        /*
        int ageOfStudent = 23
        System.out.println("this student's age is " + ageOfStudent);
            System.out.println("I am done");
        int ageOfStudent = 43
        System.out.println("this student's age is " + ageOfStudent);
            System.out.println("I am done");
        int ageOfStudent = 5
        System.out.println("this student's age is " + ageOfStudent);
            System.out.println("I am done");
        int ageOfStudent = 7
        System.out.println("this student's age is " + ageOfStudent);
            System.out.println("I am done");
        int ageOfStudent = 87
        System.out.println("this student's age is " + ageOfStudent);
            System.out.println("I am done");
         */


    }
}

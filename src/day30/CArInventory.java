package day30;

public class CArInventory {

    public static void main(String[] args) {

        String[]cars = {
                "Acura-NSX",
                "Chevrolet-Corvette",
                "Chevrolet-Cavalier",
                "BMW-3 Series",
                "Pontiac-LeMans",
                "BMW-7 Series",
                "Oldsmobile-Achieva",
                "Honda-Civic"};

        // Task 1 : count Chevrolet and Civic

        int chevyCNT = 0;
        int civicCNT  = 0;

        for (String eachCar : cars ){
            //if(eachCar.startsWith("Chevrolet")){
            // what if I want case insensitivity
            if (eachCar.toLowerCase().startsWith("chevrolet")) {
                chevyCNT++;
            }
            if (eachCar.toUpperCase().contains("CIVIC")) {
                civicCNT++;
            }

        }
        System.out.println("chevyCNT = " + chevyCNT);
        System.out.println("civicCNT = " + civicCNT);



    }
}

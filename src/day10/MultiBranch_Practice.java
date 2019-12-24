package day10;

public class MultiBranch_Practice {

    public static void main(String[] args) {

        // At the McDonalds Drive thru
        System.out.println("Welcome to Mcdonals , what can I get for you ");

        int itemNumber = 35;
        String order = "";

        if (itemNumber == 11){
            System.out.println("You have selected 1");
            order = "Burger";
        }else if (itemNumber == 5){
            System.out.println("You have selected 5");
            order = "French Fries";
        }else if (itemNumber == 8){
            System.out.println("You have selected 8");
            order = "Nuggets";
        }else if (itemNumber== 35){
            System.out.println("You have selected 35");
            order = "Ice Cream";
        }else {
            System.out.println("You have selected unknown item order");
            order = "unknown";
        }

        System.out.println("Your order is " + order);
    }
}

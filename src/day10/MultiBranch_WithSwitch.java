package day10;

public class MultiBranch_WithSwitch {

    public static void main(String[] args) {

        // At the McDonalds Drive thru
        System.out.println("Welcome to Mcdonals , what can I get for you ");

        int itemNumber = 88;
        String order = "";
        switch (itemNumber){

            case 11 :
            System.out.println("You have selected 11");
            order = "Burger";
            break;
            case 5 :
            System.out.println("You have selected 5");
            order = "French Fries";
            break;
            case 8 :
                System.out.println("You have selected 8");
            order = "Nuggets";
            break;
            case 35 :
                System.out.println("You have selected 35");
            order = "Ice Cream";
            break;
            default:
                System.out.println("You have selected unknown item order");
            order = "unknown";
        }

        System.out.println("Your order is " + order);







    }
}

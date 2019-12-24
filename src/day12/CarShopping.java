package day12;

public class CarShopping {

    public static void main(String[] args) {

        // Buy corolla or Tesla (only if its within the budget)
        // there is only one car covered with the cloth
        // we dont know what car it is and what is the price
        // once we take off the cloth
        // we check whether its toyota, if its we buy it without checking the price
        // if it is not we check if its a tesla and also check whether it is within the budbet

        String carbrand = "Corolla";
        int carPrice = 60000;
        int budget = 40000;

        if (carbrand.equals("Corolla") || carbrand.equals("Tesla") && carPrice <= budget  ){

            System.out.println("CAR AQUIRED!!!!");

        }else{
            System.out.println("NOT WHAT I AM LOOKING FOR ");
        }
    }
}

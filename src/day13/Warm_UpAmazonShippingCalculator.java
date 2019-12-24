package day13;

public class Warm_UpAmazonShippingCalculator {

    public static void main(String[] args) {


        /*
         * Amazon has 2 type of user one is Prime member and another is regular member
         * prime member get free shipping in all purchase no matter the amount
         * regular member user get free  shipping only if their purchase is more than 25$
         * otherwise they get 5$ shipping fee
         *
         * */

        String memberType = "Prime member";
        double amount = 15.99d ;
        int shippingFee = 0 ;

        // first I want to check if it's prime member or not

        if (memberType.equalsIgnoreCase("PRIME MEMBER")){
            System.out.println("Your final price is " + amount);
        }else if (amount > 25 ){
            System.out.println("Your order is more than 25");
        }else {
            System.out.println("Do you want to sign up for Prime Membership");
            shippingFee = 5;
            amount = amount + shippingFee ; // amount += shippingFee
            System.out.println("Your final amount is " + amount);
        }



    }




}

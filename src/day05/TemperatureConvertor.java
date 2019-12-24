package day05;

import java.util.Scanner;

public class TemperatureConvertor {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is the temperature in F ? ");

        double farenheit = scan.nextDouble();

        double celsius = (5.0 / 9)* (farenheit - 32);

        // farenheit 80 is 23 in celsius
        System.out.println("farenheit" + farenheit + "is " + celsius + "in celsius");

    }
}

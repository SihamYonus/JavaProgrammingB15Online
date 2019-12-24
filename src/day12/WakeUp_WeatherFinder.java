package day12;

public class WakeUp_WeatherFinder {

    public static void main(String[] args) {

        // create a variable to store the weather of your city right now

        // And write a if else is else statement to do the following

        // If weather Sunny ---> Code in Sunny weather
        // If weather Rainy ---> Code in Rainy weather
        // If Weather Cloudy ---> Code in Cloudy weather
        // If Weather Snonwy ---> Code in Snowy weather
        //Else --->> rain or shine just keep coding anyway

        String weather = "Cloudy" ;

        if (weather.equals("Sunny")){
            System.out.println("Code in Sunny Weather");
        }else if (weather.equals("Rainy")){
            System.out.println("Code in Rainy Weather");
        }else if (weather.equals("Cloudy")) {
            System.out.println("Code in Cloudy Weather");
        }else if (weather.equals("Snowy")){
            System.out.println("Code in Cloudy Weather");
        }else{
            System.out.println("Rain or shine just keep coding anyway");
        }
    }
}

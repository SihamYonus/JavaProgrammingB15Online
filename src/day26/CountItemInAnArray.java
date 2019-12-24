package day26;

import java.util.Arrays;

public class CountItemInAnArray {

    public static void main(String[] args) {

        String[] marvelHeroes = {"Iron Man", "Captain America", "Spider man",
                "Black Panther", "Hulk", "Black Widow", "Wanda", "Captain Marvel",
                "Captain America", "Spider man",
                "Black Widow", "Wanda", "Captain Marvel",
                "Captain America"};

        System.out.println("marvelHeros = " + Arrays.toString(marvelHeroes) );
        int sizeOfArray = marvelHeroes.length;
        System.out.println("Hero count = " + sizeOfArray);

        String itemToSearch = "Black Widow";
        int countOfItem = 0;

        for(String eachHeroes: marvelHeroes){

            if(eachHeroes.equals(itemToSearch)){
                countOfItem++;
            }
        }
        System.out.println("countOfItem = "+ countOfItem);

        // COUNT THE HERO WITH THE NAME THAT CONTAINS BLACK IN CASE INSENSITIVE MANNER


        int cntOfBlackInName = 0;

        for (String eachHero: marvelHeroes){

            if (eachHero.toLowerCase().contains("black")){
                cntOfBlackInName++;
            }
        }

        System.out.println("cntOfBlackInName = "+ cntOfBlackInName);









    }
}

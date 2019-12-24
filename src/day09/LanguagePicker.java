package day09;

public class LanguagePicker {

    public static void main(String[] args) {

        int languageOption = 5;
        String greeting = "";

        if (languageOption==1){
            greeting = "Hello SDET";
        }else if (languageOption==2) {
            greeting = "Salam SDET";
        }else if (languageOption==3){
            greeting = "Hola SDET";
        }else if (languageOption==4){
            greeting = "Privet SDET";
        }else if ((languageOption==5)){
            greeting = "Merhaba SDET";
        }else if (languageOption==6){
            greeting = "Szia SDET";
        }else if (languageOption==7){
            greeting = "Bonjour SDET";
        }else {
            greeting = "Unknown";
        }


        System.out.println(greeting );



    }
}

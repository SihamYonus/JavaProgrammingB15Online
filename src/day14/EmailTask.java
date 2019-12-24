package day14;

public class EmailTask {

    public static void main(String[] args) {
//
//        Create a class called EmailChecker with main method:
//        create a variable called email
//        check for below conditions
//        if it does not contain character @  say invalid email
//        if it contain space say invalid email
//        if it endsWith @gmail.com  -->> gmail
//        if it endsWith @yahoo.com  -->> yahoo email
//        if it endsWith @mail.ru  -->> russian email
//
//
        String email = "yonus.simu@gmail.com";



      if (  !email.contains("@") || email.contains(" ") ){
          System.out.println("Invalid Email");

      }else if (email.endsWith("@gmail.com")){
          System.out.println("GMAIL EMAIL");

      }else if (email.endsWith("@yahoo.com")){
          System.out.println("YAHOO EMAIL");

      }else if (email.endsWith("@mail.ru")){
            System.out.println("RUSSIAN EMAIL");
        }
    }
}

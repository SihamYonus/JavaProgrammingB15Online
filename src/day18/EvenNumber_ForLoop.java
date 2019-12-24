package day18;

public class EvenNumber_ForLoop {

    public static void main(String[] args) {

        // skip counting by 2
        // starting from o

        for (int x = 0 ; x < 100 ; x += 2  ){
            System.out.print(x + " ");
        }

        System.out.println("----------------------");

        // skip counting by 3

        for (int i = 0 ; i < 100 ; i += 3){
            System.out.print(i + " ");
        }

        // odd number
        // THE SHORT CUT FOR GENERATING FOR LOOP IS : fori enter or tab

        for (int i = 0; i < 100 ; i++) {

            if(i % 2 == 0){
                System.out.print(i + " ");
            }

            System.out.println("--------------");

            // fizz buzz number

            for (int y = 0; y < 100 ; y++) {
                if (i % 5 == 0 && i % 3 == 0) {
                    System.out.print(y + " IS FIZZ BUZZ NUMBER ");
                }

            }
        }
    }

}

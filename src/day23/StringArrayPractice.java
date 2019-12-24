package day23;

public class StringArrayPractice {

    public static void main(String[] args) {
        
        String[] shows = {"Orville","Gifted","Game of Throne","Flash","Arrow","Super Girl"};

        String myFavoriteShow = "Orville";
        System.out.println("myFavoriteShow = " + myFavoriteShow);
        System.out.println("my favorite show character count is : " + myFavoriteShow.length());
        System.out.println("myFavoriteShow = " + myFavoriteShow + " char count is : " + myFavoriteShow.length());


        int showCount = shows.length;
        System.out.println("showCount = " + showCount);

        for (int i = 0; i < showCount; i++) {
           String currentShow = (shows[i]);
            System.out.println(currentShow + " has character count : " + currentShow.length());
        }
        
    }
}

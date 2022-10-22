import java.util.*;

public class Anime {
    String title;
    String genre;
    String bestChar;

    // This is a constructor

    public Anime(String animeT, String animeC, String animeG) {
        title = animeT;
        bestChar = animeC;
        genre = animeG;
    }

    // getter and setter
    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setBestChar(String bestChar) {
        this.bestChar = bestChar;
    }

    public String getTitle() {
        return title;
    }

    public String getBestChar() {
        return bestChar;
    }

    public String getGenre() {
        return genre;
    }

    public static String websiteUsed(List<String> webUsed) {
        // I used Random function picker based on the array
        Random randomNehSiya = new Random();
        return webUsed.get(randomNehSiya.nextInt(webUsed.size()));
    }

    public static void introduction(List<Anime> myList) {
        System.out.println("**************************************************************************");
        System.out.println("Your Anime List: ");
        for (Anime newList : myList) {
            System.out
                    .println(
                            "Title: " + newList.title + "      " + " Character: " + newList.bestChar + "      "
                                    + " Genre: "
                                    + newList.genre);
        }
        System.out.println("**************************************************************************");

    }

}

import java.util.*;

public class Main {
    public static void main(String[] agay) {
        Scanner input = new Scanner(System.in);
        List<Anime> myList = new ArrayList<Anime>();
        List<String> webUsed = new ArrayList<String>();
        webUsed.add("Crunchyroll");
        webUsed.add("Netflix");
        webUsed.add("Kissanime");
        webUsed.add("Hulu");
        webUsed.add("IQIYI");
        webUsed.add("Gogoanime");
        webUsed.add("9anime");
        webUsed.add("Funimation");

        do {
            System.out.println("\nAdding, removing, displaying and exit the program of the ArrayList.");
            System.out.println(
                    "Type A to Add \nType B to Remove \nType C to Display \nType X to Exit. ");

            char choices[] = new char[] { 'A', 'B', 'C', 'X' };
            char chosen = input.next().toUpperCase().charAt(0);

            try {
                if (choices[0] == chosen) {
                    System.out.println("Enter how many times you store: ");
                    int fnum = input.nextInt();
                    if (fnum < 0) {
                        input.close();
                    } else {
                        int i = 0;

                        while (i < fnum) {

                            // ask user the title of the anime
                            System.out.print("Title: ");
                            String animeT = input.next();
                            input.nextLine();
                            // ask user the character name
                            System.out.println("Character: ");
                            String animeC = input.nextLine();

                            // ask user the genre of the anime
                            System.out.print("Genre: ");
                            String animeG = input.nextLine();
                            myList.add(new Anime(animeT, animeC, animeG));

                            i++;
                        }
                    }
                }

                else if (choices[1] == chosen) {
                    // Removing values to an array
                    System.out.println("Input the specific index you want to remove: ");
                    myList.remove(input.nextInt());
                    System.out.println("After removing values:");
                    Anime.introduction(myList);
                } else if (choices[2] == chosen) {
                    // Displaying values to an array
                    System.out.println(
                            "\nYou used: " + " \"" + Anime.websiteUsed(webUsed).toUpperCase() + "\""
                                    + " watching your favorite anime. That's Good.");
                    Anime.introduction(myList);
                } else if (choices[3] == chosen) {
                    System.out.println("The program stopped!");
                    input.close();
                } else {
                    System.out.println("Oops you inputted wrong! try again.");
                }

                System.out.println("Do you want to continue the program? y/n");
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println(e);
            }

        } while (input.next().equals("y"));
        input.close();

    }
}

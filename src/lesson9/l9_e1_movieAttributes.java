package lesson9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class l9_e1_movieAttributes {

    public static void main(String[] args) {

        ArrayList<String> genreDramaAndComedy = new ArrayList<>();
        genreDramaAndComedy.add("Drama");
        genreDramaAndComedy.add("Comedy");

        ArrayList<String> actionAndAdventure = new ArrayList<>();
        actionAndAdventure.add("Action");
        actionAndAdventure.add("Adventure");

        ArrayList<String> soapAndMystery = new ArrayList<>();
        soapAndMystery.add("Soap");
        soapAndMystery.add("Mystery");

        ArrayList<String> allGenres = new ArrayList<>();
        allGenres.add("Drama");
        allGenres.add("Soap");
        allGenres.add("Mystery");
        allGenres.add("Adventure");
        allGenres.add("Action");
        allGenres.add("Comedy");


        Movie movie1 = new Movie("Twin Peaks",  soapAndMystery, 3.4);
        Movie movie2 = new Movie("Batman", actionAndAdventure, 4.8);
        Movie movie3 = new Movie("The Avengers", actionAndAdventure, 8.2);
        Movie movie4 = new Movie("The X-Files", genreDramaAndComedy, 7.0);

//          Invalid rating for movie test
//        Movie movie5 = new Movie("Barbie", genreDramaAndComedy, 0.8);
        Movie movie5 = new Movie("Barbie", genreDramaAndComedy, 2.8);

        Movie movie6 = new Movie("Star troopers", new ArrayList<>(Collections.singletonList(allGenres.get(3))), 4.8);
        Movie movie7 = new Movie("Terminator", new ArrayList<>(Arrays.asList(allGenres.get(0))), 4.8);

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> selectGenre = new ArrayList<>();

        System.out.println("Enter number [0-5] to select a genre from the list for movie8 (Popaye): ");
        int[] enterIndexNumber = {scanner.nextInt()};
        for (int i:enterIndexNumber){
            selectGenre.add(allGenres.get(i));
        }

        Movie movie8 = new Movie("Popaye",selectGenre, 4.8);

        movie1.printMovieInfo();
        System.out.println("-------------------");

        movie2.printMovieInfo();
        System.out.println("-------------------");

        movie3.printMovieInfo();
        System.out.println("-------------------");

        movie4.printMovieInfo();
        System.out.println("-------------------");

        movie5.printMovieInfo();
        System.out.println("-------------------");

        movie6.printMovieInfo();
        System.out.println("-------------------");

        movie7.printMovieInfo();
        System.out.println("-------------------");

        movie8.printMovieInfo();


    }

}

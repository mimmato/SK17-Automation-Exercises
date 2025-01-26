package lesson9;

import java.util.ArrayList;

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

        Movie movie1 = new Movie("Twin Peaks",  soapAndMystery, 3.4);
        Movie movie2 = new Movie("Batman", actionAndAdventure, 4.8);
        Movie movie3 = new Movie("The Avengers", actionAndAdventure, 8.2);
        Movie movie4 = new Movie("The X-Files", genreDramaAndComedy, 7.0);
//          Invalid rating for movie test
//        Movie movie5 = new Movie("Barbie", genreDramaAndComedy, 0.8);
        Movie movie5 = new Movie("Barbie", genreDramaAndComedy, 0.8);



        movie1.printMovieInfo();
        System.out.println("-------------------");

        movie2.printMovieInfo();
        System.out.println("-------------------");

        movie3.printMovieInfo();
        System.out.println("-------------------");

        movie4.printMovieInfo();
        System.out.println("-------------------");

        movie5.printMovieInfo();

    }

}

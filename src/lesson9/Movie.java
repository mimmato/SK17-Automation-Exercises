package lesson9;

import java.util.ArrayList;

public class Movie {

    public String title;

    public ArrayList<String> genre;

    public double rating;

    public Movie(String title, ArrayList<String> genre, double rating){

        this.title = title;
        this.genre = genre;

        if (rating < 1.0 || rating > 10.0){
            throw new IllegalArgumentException("Rating cannot be less than 1.0 or more than 10.0 - fix value: " + rating);
        }
        this.rating = rating;
    }

    public void printMovieInfo(){
        System.out.println("Movie title is: " + this.title);
        System.out.println("Genre is: " + this.genre);
        System.out.println("Rating is: " + this.rating);
    }

}

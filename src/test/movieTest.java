package test;

import movie.movie;
import movie.movieItem;

public class movieTest {

    public static void main(String[] args) {
        movie myMovieCollection = new movie();

        movieItem item1 = new movieItem("The Departed", "Jack Nicholson");
        movieItem item2 = new movieItem("La haine", "Vincent Cassel");
        movieItem item3 = new movieItem("Vikings", "Ragnar Lothbrok");

        myMovieCollection.addmovieItem(item1);
        myMovieCollection.addmovieItem(item2);
        myMovieCollection.addmovieItem(item3);

        System.out.println("Movie Title: " + item1.getTitle());
        System.out.println("Movie Title: " + item2.getTitle());
        System.out.println("Movie Title: " + item3.getTitle());

        myMovieCollection.printmovieDetails();
    }
}


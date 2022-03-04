
package movies;

import util.Input;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class MoviesApplication
{
    public static void app()
    {
        System.out.println("What would you like to do:\n");
    //
        System.out.println(" 0 - exit\n 1 - view all movies\n 2 - view movies in the animated category\n 3 - view movies in the drama category\n 4 - view movies in the horror category\n 5 - view movies in the scifi category\n 6 - Add a new movie");

        Movie[] movieList = MoviesArray.findAll();

        int choice = Input.getInt();
        if(choice == 0)
        {
            System.exit(0);
        }
        else if(choice == 1)
        {
            displayMovies(movieList, "all");
            System.out.println();
            app();
        }
        else if(choice == 2)
        {
            displayMovies(movieList,"animated");
//            for(int i = 0; i <= movieList.length - 1; i++)
//            {
//                if(Objects.equals(movieList[i].getCategory(), "animated"))
//                    System.out.println( movieList[i].getName() + " --- "+ movieList[i].getCategory());
//            }
            System.out.println();
            app();
        }
        else if(choice == 3)
        {
            displayMovies(movieList,"drama");
            System.out.println();
            app();
        }
        else if(choice == 4)
        {
            displayMovies(movieList,"horror");
            System.out.println();
            app();
        }
        else if(choice == 5)
        {
            displayMovies(movieList,"scifi");
            System.out.println();
            app();
        }
        else if(choice == 6)
        {
            System.out.println("Name a movie: ");
            String newMovieName = Input.getString();
            System.out.println("What is the category: ");
            String newMovieCat = Input.getString();
            System.out.println(newMovieCat + " " + newMovieName);

            Movie newMovie = new Movie(newMovieName, newMovieCat);

            Movie[] newMovieList = addMovie(movieList.length, movieList,newMovie);

            System.out.println("Movie added!");
            displayMovies(newMovieList,"all");
            System.out.println();
            app() ;
        }
        else
        {
            System.out.println("not a choice");
        }
    }

    public static void displayMovies(Movie[] movieList,String cat)
    {
        if (Objects.equals(cat, "all"))
        {
            for (int i = 0; i <= movieList.length - 1; i++)
            {
                System.out.println("Movie = " + movieList[i].getName() + "  Category = " + movieList[i].getCategory());
            }
        }
        else
        {
            for (int i = 0; i <= movieList.length - 1; i++)
            {
                if (Objects.equals(movieList[i].getCategory(), cat))
                {
                    System.out.println(movieList[i].getName() + " --- " + movieList[i].getCategory());
                }
            }
        }
    }
    // Function to add new movie in arr
    public static Movie[] addMovie( int n, Movie[] movieList, Movie newMovie)
    {
        // create a new array of size n+1
        Movie[] newArr = new Movie[ n + 1];

        // insert the elements from
        // the old array into the new array
        // insert all elements till n
        // then insert x at n+1
        for (int i = 0; i < n; i++)
        {
            newArr[i] = movieList[i];
        }
        newArr[n] = newMovie;

        return newArr;
    }
    public static void main(String[] args)
    {
        app();
    }



}

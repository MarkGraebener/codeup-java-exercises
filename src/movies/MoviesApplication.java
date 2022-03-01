
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
//        System.out.println("movieList = " + Arrays.toString(movieList));
//        System.out.println(movieList[0].getName());

//        System.out.println(Input.getInt());
    int choice = Input.getInt();
    if(choice == 0)
    {
        System.exit(0);
    }
    else if(choice == 1)
    {
        for(int i = 0; i <= movieList.length - 1; i++)
        {
            System.out.println("Movie = " + movieList[i].getName() + "  Category = "+ movieList[i].getCategory());
        }
        app();
    }
    else if(choice == 2)
    {
        for(int i = 0; i <= movieList.length - 1; i++)
        {
            if(Objects.equals(movieList[i].getCategory(), "animated"))
                System.out.println( movieList[i].getName() + " --- "+ movieList[i].getCategory());
        }
        app();
    }
    else if(choice == 3)
    {
        for(int i = 0; i <= movieList.length - 1; i++)
        {
            if(Objects.equals(movieList[i].getCategory(), "drama"))
                System.out.println( movieList[i].getName() + " --- "+ movieList[i].getCategory());
        }
        app();
    }
    else if(choice == 4)
    {
        for (int i = 0; i <= movieList.length - 1; i++)
        {
            if (Objects.equals(movieList[i].getCategory(), "horror"))
                System.out.println(movieList[i].getName() + " --- " + movieList[i].getCategory());
        }
        app();
    }
    else if(choice == 5)
    {
        for (int i = 0; i <= movieList.length - 1; i++) {
            if (Objects.equals(movieList[i].getCategory(), "scifi"))
                System.out.println(movieList[i].getName() + " --- " + movieList[i].getCategory());
        }
        app();
    }
    else if(choice == 6)
    {
        System.out.println("Name a movie: ");
        String newMovieName = Input.getString();
        System.out.println("What is the category: ");
        String newMovieCat = Input.getString();
        System.out.println(newMovieCat + " " + newMovieName);

        movieList.add(new Movie(newMovieName, newMovieCat));
//        addMovie(movieList, new Movie(newMovieName,newMovieCat));

        System.out.println("Movie added!");
        app();
    }
    else
    {
        System.out.println("not a choice");
    }
}
//public static Movie[] addMovie(Movie[] movies, Movie newMovie)
//{
//    Movie[] temArr = Arrays.copyOf(movies, movies.length + 1);
//    temArr[temArr.length -1] = newMovie;
//    for(Movie movie: temArr)
//    {
//        System.out.println(movie.getName() + "  " + movie.getCategory());
//    }
//    return temArr;
//}
    public static void main(String[] args)
    {
        app();
    }



}

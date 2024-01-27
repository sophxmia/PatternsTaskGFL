package patterns.example;

import java.util.ArrayList;
import java.util.List;

public class MovieCatalog {
    private final List<Observer> observers = new ArrayList<>();
    private List<Movie> movies = new ArrayList<>();

    public void addObservers(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
        notifyObservers("New movie was added: " + movie.getTitle());
    }

    public void removeMovie(Movie movie) {
        movies.remove(movie);
        notifyObservers("Movie was remover: " + movie.getTitle());
    }

    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public List<Movie> getMovies(){
        return movies;
    }
}

package org.example.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class MovieDatabase implements Observed{
    List<String> movies = new ArrayList<>();

    List<Observer> subscribers = new ArrayList<>();

    public void addMovie(String movie){
        this.movies.add(movie);
        notifyObservers();
    }

    public void removeMovie(String movie){
        this.movies.remove(movie);
        notifyObservers();
    }
    @Override
    public void addObserver(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: subscribers){
            observer.handleEvent(this.movies);
        }
    }
}

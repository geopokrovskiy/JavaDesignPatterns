package org.example.behavioural.observer;

public class MovieSearch {
    public static void main(String[] args) {
        MovieDatabase database = new MovieDatabase();

        database.addMovie("Hatiko");
        database.addMovie("Titanic");

        Observer subscriber1 = new Subscriber("George");
        Observer subscriber2 = new Subscriber("Iuliana");

        database.addObserver(subscriber1);
        database.addObserver(subscriber2);

        database.addMovie("Harry Potter");
    }
}

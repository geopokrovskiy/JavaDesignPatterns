package org.example.behavioural.observer;

import java.util.List;

public interface Observer {
    public void handleEvent(List<String> movies);
}

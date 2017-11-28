package com.maxwareapps.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Define a one-to-many dependency between objects so that when one object changes state,
 * all its dependents are notified and updated automatically.
 */
public abstract class Subject {

    //The Subject is coupled only to the Observer base class
    private List<Observer> observers = new ArrayList<>();
    private int state = 0;

    //Observers register themselves with the Subject
    public void attach(Observer newObserver) {
        observers.add(newObserver);
    }
    public void detach(Observer observer) {

    }
    //The Subject broadcasts events to all registered Observers
    public void notifyObservers(){
        for (Observer o: observers) o.update();
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }
}

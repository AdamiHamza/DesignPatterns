package com.maxwareapps.behavioral.observer;

/**
 * The "View" part of Model-View-Controller.
 */
public abstract class Observer {
    //The Observer is coupled only to the Subject base class
    protected Subject subject;

    //Observers "pull" the information they need from the Subject
    public abstract void update();

    public Observer(Subject subject) {
        this.subject = subject;
    }

    //Observers can alter subject state.
    public abstract void execute(int newState);
}

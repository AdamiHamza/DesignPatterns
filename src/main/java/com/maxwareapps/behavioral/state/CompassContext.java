package com.maxwareapps.behavioral.state;

public class CompassContext {
    private State compassState;

    public CompassContext(State compassState) {
        this.compassState = compassState;
    }

    public void setCompassState(State compassState) {
        this.compassState = compassState;
    }

    public State getCompassState() {
        return compassState;
    }

    public void turnLeft (){
        this.compassState.turnLeft(this);
    }

    public void turnRight (){
        this.compassState.turnRight(this);
    }
}

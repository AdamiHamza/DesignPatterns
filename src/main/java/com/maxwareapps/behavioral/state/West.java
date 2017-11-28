package com.maxwareapps.behavioral.state;

public class West implements State {
    @Override
    public void turnLeft(CompassContext compassContext) {
        compassContext.setCompassState(new North());
        System.out.println("Turning North");
    }

    @Override
    public void turnRight(CompassContext compassContext) {
        compassContext.setCompassState(new South());
        System.out.println("Turning South");
    }
}

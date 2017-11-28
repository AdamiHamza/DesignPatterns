package com.maxwareapps.behavioral.state;

public class East implements State {
    @Override
    public void turnLeft(CompassContext compassContext) {
        compassContext.setCompassState(new South());
        System.out.println("Turning South");
    }

    @Override
    public void turnRight(CompassContext compassContext) {
        compassContext.setCompassState(new North());
        System.out.println("Turning North");
    }
}

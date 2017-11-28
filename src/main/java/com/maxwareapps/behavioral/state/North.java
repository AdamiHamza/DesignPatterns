package com.maxwareapps.behavioral.state;

public class North implements State{
    @Override
    public void turnLeft(CompassContext compassContext) {
        compassContext.setCompassState(new East());
        System.out.println("Turning East");
    }

    @Override
    public void turnRight(CompassContext compassContext) {
        compassContext.setCompassState(new West());
        System.out.println("Turning West");
    }
}

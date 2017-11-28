package com.maxwareapps.behavioral.state;

/**
 * Allow an object to alter its behavior when its internal state changes.
 * The object will appear to change its class.
 *
 */
public interface State {
    void turnLeft(CompassContext compassContext);
    void turnRight(CompassContext compassContext);
}

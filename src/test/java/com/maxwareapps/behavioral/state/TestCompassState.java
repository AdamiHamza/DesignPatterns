package com.maxwareapps.behavioral.state;

import org.hamcrest.core.IsInstanceOf;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for State Design Pattern (Compass State).
 */
public class TestCompassState {

    @Test
    public void testTurnLeft(){
        CompassContext compassContext = new CompassContext(new North());
        compassContext.turnLeft();
        Assert.assertThat(compassContext.getCompassState() , new IsInstanceOf(East.class));
        compassContext.turnLeft();
        Assert.assertThat(compassContext.getCompassState() , new IsInstanceOf(South.class));
        compassContext.turnLeft();
        Assert.assertThat(compassContext.getCompassState() , new IsInstanceOf(West.class));
        compassContext.turnLeft();
        Assert.assertThat(compassContext.getCompassState() , new IsInstanceOf(North.class));
    }

    @Test
    public void testTurnRight(){
        CompassContext compassContext = new CompassContext(new North());
        compassContext.turnRight();
        Assert.assertThat(compassContext.getCompassState() , new IsInstanceOf(West.class));
        compassContext.turnRight();
        Assert.assertThat(compassContext.getCompassState() , new IsInstanceOf(South.class));
        compassContext.turnRight();
        Assert.assertThat(compassContext.getCompassState() , new IsInstanceOf(East.class));
        compassContext.turnRight();
        Assert.assertThat(compassContext.getCompassState() , new IsInstanceOf(North.class));
    }
}

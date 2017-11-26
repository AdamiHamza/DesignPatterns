package com.maxwareapps.structural.flyweight;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for FlyWeight Design Pattern (Species Flyweight Factory).
 */
public class TestFlyWeightSpeciesFactory {

    @Test
    public void tesFlyWeightSpeciesCreation(){
        FlyweightSpeciesFactory speciesFactory = FlyweightSpeciesFactory.getFactory();
        BillionSpecies ant1 = speciesFactory.createSpecy(FlyweightSpeciesFactory.SpecyType.ANT);
        BillionSpecies dunky1 = speciesFactory.createSpecy(FlyweightSpeciesFactory.SpecyType.DUNKY);
        BillionSpecies elephant1 = speciesFactory.createSpecy(FlyweightSpeciesFactory.SpecyType.ELEPHANT);
        BillionSpecies dunky2 = speciesFactory.createSpecy(FlyweightSpeciesFactory.SpecyType.DUNKY);
        BillionSpecies ant2 = speciesFactory.createSpecy(FlyweightSpeciesFactory.SpecyType.ANT);
        BillionSpecies elephant2 = speciesFactory.createSpecy(FlyweightSpeciesFactory.SpecyType.ELEPHANT);
        Assert.assertSame(ant1,ant2);
        Assert.assertSame(dunky1,dunky2);
        Assert.assertSame(elephant1,elephant2);
    }
}

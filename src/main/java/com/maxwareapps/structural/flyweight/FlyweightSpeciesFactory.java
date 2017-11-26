package com.maxwareapps.structural.flyweight;

import java.util.HashMap;

public class FlyweightSpeciesFactory {
    public HashMap<SpecyType,BillionSpecies> speciesCache = new HashMap<SpecyType, BillionSpecies>();
    public enum SpecyType{ANT,DUNKY,ELEPHANT}
    private static FlyweightSpeciesFactory INSTANCE = null;

    private FlyweightSpeciesFactory() {
    }

    public static FlyweightSpeciesFactory getFactory(){
        if (INSTANCE == null){
            INSTANCE= new FlyweightSpeciesFactory();
        }
        return INSTANCE;
    }

    //Only God capable to do this
    public BillionSpecies createSpecy(SpecyType specyType){
        BillionSpecies billionSpecies = speciesCache.get(specyType);
        if(billionSpecies == null){
            System.out.println("Creating Specie");
            switch (specyType){
                case ANT:
                    billionSpecies = new Ant();
                    break;
                case DUNKY:
                    billionSpecies = new Dunky();
                    break;
                case ELEPHANT:
                    billionSpecies = new Elephant();
            }
            speciesCache.put(specyType,billionSpecies);
        }
        return billionSpecies;
    }
}

package com.maxwareapps.creational.factory.simplefactory;


/**
 * Whenever you see there are chances to create many implementations of a product go for the Simple factory.
 */
public class TVSimpleFactory {
    private static TVSimpleFactory INSTANCE = null;
    enum TVMODEL{TOSHIBA,SONY,SAMSUNG}

    private TVSimpleFactory() {
    }

    public static TVSimpleFactory getFactory(){
        if (INSTANCE == null){
             INSTANCE = new TVSimpleFactory();
        }
        return INSTANCE;
    }

    public ITV newTV(TVMODEL model){
        switch (model){
            case TOSHIBA:
                return new Toshiba();
            case SONY:
                return new Sony();
            case SAMSUNG:
                return new Samsung();
            default:
                throw new IllegalArgumentException("Wrong Argument");
        }
    }

}

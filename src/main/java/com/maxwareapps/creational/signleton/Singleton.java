package com.maxwareapps.creational.signleton;

/**
 * Singleton
 *
 * Ensure a class has only one instance, and provide a global point of access to it.
 * Application needs one, and only one, instance of an object.
 * Additionally, lazy initialization and global access are necessary.
 */
public class Singleton {
    private static Singleton INSTANCE = null;

    /* A private Constructor prevents any other
     * class from instantiating.
     */
    private Singleton() { }

    /* Static 'instance' method */
    public static Singleton getInstance( ) {
        if (INSTANCE == null) {
            INSTANCE =  new Singleton();
        }
        return INSTANCE;
    }
}

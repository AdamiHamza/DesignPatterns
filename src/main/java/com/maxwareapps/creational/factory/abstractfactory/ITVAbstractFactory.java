package com.maxwareapps.creational.factory.abstractfactory;


/**
 * Provide an interface for creating families of related or dependent objects
 * without specifying their concrete classes.
 */
public interface ITVAbstractFactory {
    ITV createSonyTV();
    ITV createSamsungTV();
}

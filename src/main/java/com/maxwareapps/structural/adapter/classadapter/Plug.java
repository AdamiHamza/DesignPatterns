package com.maxwareapps.structural.adapter.classadapter;

/**
 * Created by adamihamza on 14/06/17.
 */
public class Plug implements IPlug{
    public Volt getVolt(){
        return new Volt(240);
    }
}

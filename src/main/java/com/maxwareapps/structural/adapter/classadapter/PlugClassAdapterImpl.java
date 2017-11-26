package com.maxwareapps.structural.adapter.classadapter;

/**
 * Created by adamihamza on 14/06/17.
 *
 * Class adapters adapts Adaptee to Target by committing to a specific Adapter class
 * will not work when we want to adapt a class and its subclasses.
 *
 */
public class PlugClassAdapterImpl extends Plug implements PlugAdapter {
    @Override
    public Volt get240Volt() {
        Volt v = getVolt();
        return convertVolt(v,1);
    }

    @Override
    public Volt get24Volt() {
        Volt v = getVolt();
        return convertVolt(v,10);
    }

    @Override
    public Volt get12Volt() {
        Volt v = getVolt();
        return convertVolt(v,20);
    }

    private Volt convertVolt(Volt v,int i){
        v.setVolt(v.getVolt() / i);
        return v;
    }
}

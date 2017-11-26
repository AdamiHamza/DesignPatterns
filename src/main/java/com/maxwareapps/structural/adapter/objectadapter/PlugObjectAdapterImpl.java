package com.maxwareapps.structural.adapter.objectadapter;

/**
 * Created by adamihamza on 14/06/17.
 *
 * Object adapters lets a single Adapter work with many Adaptees
 * (the Adaptee and all adaptees hierarchy)
 *
 */
public class PlugObjectAdapterImpl implements PlugAdapter {
    private IPlug plug;

    public PlugObjectAdapterImpl(IPlug plug) {
        this.plug = plug;
    }

    @Override
    public Volt get240Volt() {
        Volt v = plug.getVolt();
        return convertVolt(v,1);
    }

    @Override
    public Volt get24Volt() {
        Volt v = plug.getVolt();
        return convertVolt(v,10);
    }

    @Override
    public Volt get12Volt() {
        Volt v = plug.getVolt();
        return convertVolt(v,20);
    }

    private Volt convertVolt(Volt v, int i){
        v.setVolt(v.getVolt() / i);
        return v;
    }
}

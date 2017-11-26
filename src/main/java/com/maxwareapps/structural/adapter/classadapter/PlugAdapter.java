package com.maxwareapps.structural.adapter.classadapter;

/**
 * Convert the interface of a class into another interface clients expect.
 * Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.
 */
public interface PlugAdapter {
    Volt get240Volt();
    Volt get24Volt();
    Volt get12Volt();
}

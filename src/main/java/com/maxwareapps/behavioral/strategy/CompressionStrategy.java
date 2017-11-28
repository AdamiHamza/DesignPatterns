package com.maxwareapps.behavioral.strategy;
import java.io.File;
import java.util.List;

/**
 * Define a family of algorithms, encapsulate each one, and make them interchangeable.
 * Strategy lets the algorithm vary independently from the clients that use it.
 *
 * Note : One of the dominant strategies of object-oriented design is the "open-closed principle".
 *
 * 1 - Define the interface of the algorithm
 *
 */
public interface CompressionStrategy {
    void compress(List<File> files);
}

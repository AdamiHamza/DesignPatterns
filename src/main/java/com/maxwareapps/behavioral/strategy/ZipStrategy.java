package com.maxwareapps.behavioral.strategy;


import java.io.File;
import java.util.List;

/**
 * 2 - Bury implementation
 */
public class ZipStrategy implements CompressionStrategy {
    @Override
    public void compress(List<File> files) {
        System.out.println("Compressing files using to ZIP");
    }
}

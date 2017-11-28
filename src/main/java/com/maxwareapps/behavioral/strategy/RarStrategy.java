package com.maxwareapps.behavioral.strategy;

import java.io.File;
import java.util.List;

/**
 * 2 - Bury implementation
 */
public class RarStrategy implements CompressionStrategy {
    @Override
    public void compress(List<File> files) {
        System.out.println("Compressing files using to RAR");
    }
}

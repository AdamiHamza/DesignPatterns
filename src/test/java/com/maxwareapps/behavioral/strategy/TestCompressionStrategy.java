package com.maxwareapps.behavioral.strategy;

import org.junit.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Clients can couple themselves to an interface
 */
public class TestCompressionStrategy {
    @Test
    public void testCompression(){
        CompressionContext compressionContext = new CompressionContext();
        compressionContext.setCompressionStrategy(new ZipStrategy());
        List<File> files = new ArrayList<File>();
        //Add files ...
        compressionContext.createArchive(files);
    }
}

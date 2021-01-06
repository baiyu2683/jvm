package com.zh.runbytecode;

/**
 * vm: -verbose: gc
 */
public class LocalVariablesSlotGC {

    public static void main(String[] args) {
        byte[] placeholder = new byte[64 * 1024 * 1024];
        // placeholder没有被回收
        System.gc();
    }
}

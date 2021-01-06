package com.zh.runbytecode;

/**
 * vm: -verbose: gc
 */
public class LocalVariablesSlotGC1 {

    public static void main(String[] args) {
        {
            byte[] placeholder = new byte[64 * 1024 * 1024];
        }
        // placeholder超过了使用范围，但是仍然没有被回收
        System.gc();
    }

}

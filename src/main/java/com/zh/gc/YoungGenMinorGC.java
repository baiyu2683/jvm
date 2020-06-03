package com.zh.gc;

/**
 * 年轻代minorgc
 * -verbose:gc -Xms20M -Xmx20M -Xmn10m
 * TODO 这个-Xmn10m设置完，看gc是年轻代9m，不知道原因
 */
public class YoungGenMinorGC {

    private static final int _1MB = 1024 * 1024;

    public static void main(String[] args) {
        byte[] allocation1, allocation2, allocation3, allocation4;
        allocation1 = new byte[2 * _1MB];
        allocation2 = new byte[2 * _1MB];
        allocation3 = new byte[2 * _1MB];
        allocation4 = new byte[5 * _1MB];
    }
}

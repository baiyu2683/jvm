package com.zh.chapter1;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * 本机直接内存溢出
 * -Xmx20m -XX:MaxDirectMemorySize=10m
 * 系统第二次卡死了。。。也没看到效果
 */
public class DirectMemoryOOM {

    private static final int _1MB = 1024 * 1024;

    public static void main(String[] args) throws IllegalAccessException {
        Field unsafeField = Unsafe.class.getDeclaredFields()[0];
        unsafeField.setAccessible(true);
        Unsafe unsafe = (Unsafe) unsafeField.get(null);
        while (true) {
            unsafe.allocateMemory(_1MB);
        }
    }
}

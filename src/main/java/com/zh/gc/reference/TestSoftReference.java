package com.zh.gc.reference;

import java.lang.ref.SoftReference;

/**
 * 软引用<br/>
 *
 * jvm会在即将发生OutOfMemory异常之前对SoftReference进行回收<br/>
 *
 * -Xms10m -Xmx20m
 */
public class TestSoftReference {

    public static void main(String[] args) {
        for (long i = 0 ; i < Long.MAX_VALUE ; i++) {
            SoftReference<String> stringSoftReference = new SoftReference<>(i + "asdfasdfas阿斯顿发送到发送到发送到发送大撒旦法阿斯蒂芬阿斯蒂芬阿萨德发送到发送到发送到发送到发送到发送到发斯蒂芬阿斯蒂芬阿萨德发送到发斯蒂芬阿斯蒂芬阿萨德发斯蒂芬阿萨德发送到发送到发烧地方权威服务费");
        }
        System.out.println("结束");
    }
}

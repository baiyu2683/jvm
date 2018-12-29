package com.zh.gc.reference;

import java.lang.ref.WeakReference;

/**
 * 弱引用<br/>
 *
 * jvm如果在gc时发现一个对象是弱引用的，会将自动将其回收
 * 并且所有通过强引用和软引用<b>可达的</b>弱引用也一并回收<br/>
 * 
 * -Xms10m -Xmx20m
 */
public class TestWeakReference {

    public static void main(String[] args) {
        for (long i = 0 ; i < Long.MAX_VALUE ; i++) {
            WeakReference<String> weakReference = new WeakReference<>(i + "asdfasdfas阿斯顿发送到发送到发送到发送大撒旦法阿斯蒂芬阿斯蒂芬阿萨德发送到发送到发送到发送到发送到发送到发斯蒂芬阿斯蒂芬阿萨德发送到发斯蒂芬阿斯蒂芬阿萨德发斯蒂芬阿萨德发送到发送到发烧地方权威服务费");
        }
        System.out.println("结束");
    }
}

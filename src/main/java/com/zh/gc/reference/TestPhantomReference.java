package com.zh.gc.reference;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/**
 * 虚引用<br/>
 *
 * jvm对一个虚引用，当对象被回收后，会入ReferenceQueue。<br/>
 * 虚引用get方法永远返回null，不能通过虚引用获得对象。通过isEnqueued方法可判断对象是否已经被垃圾回收。<br/>
 * 
 * -Xms10m -Xmx20m
 */
public class TestPhantomReference {

    public static void main(String[] args) {
        ReferenceQueue<String> referenceQueue = new ReferenceQueue<>();
        for (long i = 0 ; i < Long.MAX_VALUE ; i++) {
            PhantomReference<String> weakReference = new PhantomReference<>(i + "asdfasdfas阿斯顿发送到发送到发送到发送大撒旦法阿斯蒂芬阿斯蒂芬阿萨德发送到发送到发送到发送到发送到发送到发斯蒂芬阿斯蒂芬阿萨德发送到发斯蒂芬阿斯蒂芬阿萨德发斯蒂芬阿萨德发送到发送到发烧地方权威服务费",
                    referenceQueue);
        }
        System.out.println("结束");
    }
}

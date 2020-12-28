package com.zh.gc.log;

import java.lang.ref.SoftReference;

/**
 * 测试虚拟机日志格式:
 * 参数:
 * -XX:+UseConcMarkSweepGC -XX: PrintGCDetails
 */
public class TestPrintGCDetails {

    public static void main(String[] args) {
        for (long i = 0 ; i < Long.MAX_VALUE ; i++) {
            SoftReference<String> stringSoftReference = new SoftReference<>(i + "asdfasdfas阿斯顿发送到发送到发送到发送大撒旦法阿斯蒂芬阿斯蒂芬阿萨德发送到发送到发送到发送到发送到发送到发斯蒂芬阿斯蒂芬阿萨德发送到发斯蒂芬阿斯蒂芬阿萨德发斯蒂芬阿萨德发送到发送到发烧地方权威服务费");
        }
        System.out.println("结束");
    }
}

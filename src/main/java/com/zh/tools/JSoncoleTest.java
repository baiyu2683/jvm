package com.zh.tools;

import java.util.ArrayList;
import java.util.List;

/**
 * jconsole监控测试
 * jvmOption:-Xms100m -Xmx100m -XX:+UseSerialGC
 */
public class JSoncoleTest {

    static class OOMObject {
        public byte[] placeholder = new byte[64 * 1024];
    }

    public static void fillHeap(int num) throws InterruptedException {
        List<OOMObject> list = new ArrayList<OOMObject>();
        for (int i = 0 ; i < num ; i++) {
            Thread.sleep(100);
            list.add(new OOMObject());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        fillHeap(10000);
    }
}

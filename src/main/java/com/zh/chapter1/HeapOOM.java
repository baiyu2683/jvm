package com.zh.chapter1;

import java.util.ArrayList;
import java.util.List;

/**
 * 堆OOM异常
 * -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 */
public class HeapOOM {

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<>();
        while (true) {
            list.add(new OOMObject());
        }
    }
}
///usr/lib/jvm/java-1.11.0-openjdk-amd64/bin/java -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError -javaagent:/snap/intellij-idea-community/74/lib/idea_rt.jar=43273:/snap/intellij-idea-community/74/bin -Dfile.encoding=UTF-8 -classpath /home/zh/Projects/jvm/target/classes:/home/zh/repo/cglib/cglib/3.2.6/cglib-3.2.6.jar:/home/zh/repo/org/ow2/asm/asm/6.0/asm-6.0.jar:/home/zh/repo/org/apache/ant/ant/1.9.6/ant-1.9.6.jar:/home/zh/repo/org/apache/ant/ant-launcher/1.9.6/ant-launcher-1.9.6.jar com.zh.HeapOOM
//        java.lang.OutOfMemoryError: Java heap space
//        Dumping heap to java_pid17984.hprof ...
//        Exception in thread "main" Heap dump file created [34436007 bytes in 0.070 secs]
//        java.lang.OutOfMemoryError: Java heap space
//        at java.base/java.util.ArrayList.<init>(ArrayList.java:154)
//        at com.zh.OOMObject.<init>(OOMObject.java:8)
//        at com.zh.HeapOOM.main(HeapOOM.java:15)
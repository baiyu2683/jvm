package com.zh.memoryregion;

import java.util.ArrayList;
import java.util.List;

/**
 * 堆 OutOfMemory
 *
 * VM args:-Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 *
 * @author zhangheng
 */
public class HeapOOM {

    static class OOMObject {

    }

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<OOMObject>();

        while (true) {
            list.add(new OOMObject());
        }
    }
}
//java.lang.OutOfMemoryError: Java heap space
//Dumping heap to java_pid257957.hprof ...
//Heap dump file created [27492166 bytes in 0.423 secs]
//Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
//    at java.util.Arrays.copyOf(Arrays.java:2245)
//    at java.util.Arrays.copyOf(Arrays.java:2219)
//    at java.util.ArrayList.grow(ArrayList.java:242)
//    at java.util.ArrayList.ensureExplicitCapacity(ArrayList.java:216)
//    at java.util.ArrayList.ensureCapacityInternal(ArrayList.java:208)
//    at java.util.ArrayList.add(ArrayList.java:440)
//    at com.zh.memoryregion.HeapOOM.main(HeapOOM.java:23)


package com.zh.memoryregion;

import java.util.ArrayList;
import java.util.List;

/**
 * 方法区和运行时常量池的OutOfMemory
 * 运行时常量池是包含在方法区的
 *
 * jdk6 设置永久带大小和最大大小
 * VM args: -XX:PermSize=10M -XX:MaxPermSize=10M
 * 
 * jdk7 由于字符串常量池移动到java堆中了，按上述配置无法出现永久带溢出，可以设置堆大小
 * 
 *
 * @Author zh2683
 */
public class RuntimeConstantPoolOOM {

    public static void main1(String[] args) {
        //使用List保持着常量池引用，避免Full GC回收常量池的行为
        List<String> list = new ArrayList<String>();
        int i = 0;
        while (true) {
            list.add(String.valueOf(i++).intern());
        }
    }
    // jdk7限制堆大小5m时报错
//    Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
//    at java.util.Arrays.copyOf(Arrays.java:2245)
//    at java.util.Arrays.copyOf(Arrays.java:2219)
//    at java.util.ArrayList.grow(ArrayList.java:242)
//    at java.util.ArrayList.ensureExplicitCapacity(ArrayList.java:216)
//    at java.util.ArrayList.ensureCapacityInternal(ArrayList.java:208)
//    at java.util.ArrayList.add(ArrayList.java:440)
//    at com.zh.memoryregion.RuntimeConstantPoolOOM.main(RuntimeConstantPoolOOM.java:25)


    public static void main(String[] args) {

        String string1 = new StringBuilder("计算机").append("软件").toString();
        System.out.println(string1.intern() == string1);

        String string2 = new StringBuilder("ja").append("va").toString();
        System.out.println(string2.intern() == string2);
    }
}

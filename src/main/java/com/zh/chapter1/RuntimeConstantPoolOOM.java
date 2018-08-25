package com.zh.chapter1;

import java.util.ArrayList;
import java.util.List;

/**
 * 方法区和运行时常量池OOM
 * 方法区是包含运行时常量池的
 * 1.6可以抛出异常
 * 1.7修改了intern()策略，不会抛出异常
 * -XX: PermSize=10m -XX: MaxPermSize=10m
 */
public class RuntimeConstantPoolOOM {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        int i = 0;
        while (true) {
            list.add(String.valueOf(i++).intern());
        }
    }
}

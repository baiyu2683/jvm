package com.zh.classload.classloading;

public class TestRef {

    static {
        i = 0;
//        System.out.println(i);  // 非法向前引用
    }

    static int i = 1;
}

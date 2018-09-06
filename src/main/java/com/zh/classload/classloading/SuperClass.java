package com.zh.classload.classloading;

/**
 * 被动使用类字段演示一:
 * 通过子类引用父类的静态字段，不会导致子类初始化
 *
 * @author zh
 * 2018年9月3日
 */
public class SuperClass {

    static {
        System.out.println("SuperClass init!");
    }
    
    public static int value = 123;
}

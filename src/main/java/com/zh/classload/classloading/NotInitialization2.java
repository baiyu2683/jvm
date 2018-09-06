package com.zh.classload.classloading;

/**
 * 被动使用类字段演示二：
 * 通过数组引用类，不会触发此类的初始化
 *
 * @author zh
 * 2018年9月4日
 */
public class NotInitialization2 {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        SuperClass[] sca = new SuperClass[1];
    }
}

package com.zh.classload.classloading;

/**
 * 非主动使用类字段演示
 *
 * @author zh
 * 2018年9月4日
 */
public class NotInitialization {

    public static void main(String[] args) {
        System.out.println(SubClass.value);
    }
}

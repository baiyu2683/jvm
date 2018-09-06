package com.zh.classload.classloading;

/**
 * 非主动使用字段演示
 * 常量访问
 *
 * @author zh
 * 2018年9月4日
 */
public class NotInitialization3 {

    public static void main(String[] args) {
        System.out.println(ConstClass.HELLOWORD);
    }
}

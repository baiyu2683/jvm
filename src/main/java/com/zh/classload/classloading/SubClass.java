package com.zh.classload.classloading;

public class SubClass extends SuperClass {

    static {
        System.out.println("SubClass init!");
    }
}

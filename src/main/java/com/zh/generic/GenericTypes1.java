package com.zh.generic;

import java.util.List;

/**
 * 重载的范型
 * 由于两个method方法在范型擦除后，参数列表一致，编译报错
 */
public class GenericTypes1 {

//    public static void method(List<String> list) {
//        System.out.println("invoke method(List<String> list)");
//    }
    public static void method(List<Integer> list) {
        System.out.println("invoke method(List<Integer> list)");
    }

    public static void main(String[] args) {

    }
}

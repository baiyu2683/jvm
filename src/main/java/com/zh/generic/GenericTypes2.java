package com.zh.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * 重载的范型
 * 增加不同类型的返回值之后，可以重载成功(jdk6)
 */
public class GenericTypes2 {

//    public static String method(List<String> list) {
//        System.out.println("invoke method(List<String> list)");
//        return "";
//    }
    public static int method(List<Integer> list) {
        System.out.println("invoke method(List<Integer> list)");
        return 1;
    }

    public static void main(String[] args) {
    }
}

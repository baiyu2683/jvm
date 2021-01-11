package com.zh.boxing;

public class AutoBoxingTest {
    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 3;
        Integer e = 321;
        Integer f = 321;
        Long g = 3L;
//        System.out.println(c == d); // 有缓存
//        System.out.println(e == f); // 没有遇到算数运算符，不会自动拆箱，又没有缓存，所以是两个对象
//        System.out.println(c == (a + b)); // a+b,有算数运算符，所以a、b、c都会拆箱，按原始类型进行比较
//        System.out.println(c.equals(a + b)); // a+b,有算数运算符，a和b先拆箱运算，然后装箱后在执行equals
//        System.out.println(g == (a + b)); //a+b,有算数运算，a，b和g都拆箱，之后转换为long类型的和g进行比较
        System.out.println(g.equals(a + b));
    }
}

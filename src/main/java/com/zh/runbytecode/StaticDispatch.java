package com.zh.runbytecode;

import java.util.Random;

/**
 * 静态分派例子
 */
public class StaticDispatch {

    static abstract class Human {
    }
    static class Man extends Human {
    }
    static class Woman extends Human {
    }
    public void sayHello(Human guy) {
        System.out.println("hello,guy!");
    }
    public void sayHello(Man guy) {
        System.out.println("hello,gentleman!");
    }
    public void sayHello(Woman guy) {
        System.out.println("hello,lady!");
    }
    public static void main(String[] args) {
        Human man = new Man();
        Human woman = new Woman();
        StaticDispatch sr = new StaticDispatch();
        sr.sayHello(man);
        sr.sayHello(woman);

        // 实际类型变化,不确定human的实际类型是什么
        Human human = (new Random()).nextBoolean() ? new Man() : new Woman();
        sr.sayHello(human);
        // 静态类型变化,强转后，最终的静态类型在编译期仍旧可以知道
        sr.sayHello((Man) man);
        sr.sayHello((Woman) woman);

    }

}

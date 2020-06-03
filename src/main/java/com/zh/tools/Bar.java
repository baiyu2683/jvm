package com.zh.tools;

/**
 * TODO 1.6.0_35提示Unrecognized VM option '+PrintAssembly'
 */
public class Bar {
    int a = 1;
    static int b = 2;

    public int sum(int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        new Bar().sum(3);
    }
}

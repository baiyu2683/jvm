package com.zh.generic;


public class MainTest {

    public static void main(String[] args) {
        TypeErasureGenerics<String> typeErasureGenerics = new TypeErasureGenerics<String>();
        typeErasureGenerics.doSomething("123");
    }
}

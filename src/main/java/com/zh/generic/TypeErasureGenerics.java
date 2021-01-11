package com.zh.generic;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.security.Signature;

/**
 * java中不支持的反范型用法
 * @param <E>
 */
public class TypeErasureGenerics<E> {

    public void doSomething(Object item) {
//        if (item instanceof E) {         // 不合法，无法对范型进行实例判断
//            //...
//        }
//        E newItem = new E();    // 不合法，无法使用范型创建对象
//        E[] itemArray = new E[10];   // 不合法，无法使用范型创建数组

        Type type = this.getClass().getGenericSuperclass();
        System.out.println(type);
    }
}

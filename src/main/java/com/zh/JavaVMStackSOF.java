package com.zh;

/**
 * 栈深度过大时，方法区抛出StackOverflowError异常
 * -Xss136k
 */
public class JavaVMStackSOF {

    private int stackLength = 1;

    private void stackLeak() {
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) {
        JavaVMStackSOF vmStackSOF = new JavaVMStackSOF();
        try {
            vmStackSOF.stackLeak();
        } catch (StackOverflowError e) {
            throw e;
        } finally {
            System.out.println(vmStackSOF.stackLength);
        }
    }
}
//367
//        Exception in thread "main" java.lang.StackOverflowError
//        at com.zh.JavaVMStackSOF.stackLeak(JavaVMStackSOF.java:12)
//        at com.zh.JavaVMStackSOF.stackLeak(JavaVMStackSOF.java:13)
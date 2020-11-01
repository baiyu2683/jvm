package com.zh.memoryregion;

/**
 * VM args: -Xss228k
 *
 * Hotsop不区分虚拟机栈和本地方法栈
 * -Xoss(本地方法栈的设置存在但是并不生效)
 *
 * 栈StackOverflowError
 *
 * @Author zh
 */
public class JavaVMStackSOF {

    private int stackLength = 1;

    public void stackLeak() {
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) throws Throwable {
        JavaVMStackSOF javaVMStackSOF = new JavaVMStackSOF();
        try {
            javaVMStackSOF.stackLeak();
        } catch (Throwable throwable) {
            System.out.printf("stack lenght:" + javaVMStackSOF.stackLength);
            throw throwable;
        }
    }
}
//stack lenght:1515Exception in thread "main" java.lang.StackOverflowError
//at com.zh.memoryregion.JavaVMStackSOF.stackLeak(JavaVMStackSOF.java:18)
//at com.zh.memoryregion.JavaVMStackSOF.stackLeak(JavaVMStackSOF.java:19)
//at com.zh.memoryregion.JavaVMStackSOF.stackLeak(JavaVMStackSOF.java:19)
//at com.zh.memoryregion.JavaVMStackSOF.stackLeak(JavaVMStackSOF.java:19)
//at com.zh.memoryregion.JavaVMStackSOF.stackLeak(JavaVMStackSOF.java:19)
//at com.zh.memoryregion.JavaVMStackSOF.stackLeak(JavaVMStackSOF.java:19)
//at com.zh.memoryregion.JavaVMStackSOF.stackLeak(JavaVMStackSOF.java:19)
//at com.zh.memoryregion.JavaVMStackSOF.stackLeak(JavaVMStackSOF.java:19)
//at com.zh.memoryregion.JavaVMStackSOF.stackLeak(JavaVMStackSOF.java:19)
//at com.zh.memoryregion.JavaVMStackSOF.stackLeak(JavaVMStackSOF.java:19)
//at com.zh.memoryregion.JavaVMStackSOF.stackLeak(JavaVMStackSOF.java:19)

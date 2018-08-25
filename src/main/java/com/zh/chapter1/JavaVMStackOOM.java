package com.zh.chapter1;

/**
 * 通过创建线程导致内存溢出异常
 * -Xss2m
 * 这个直接运行后系统卡死了，然后重启了，没看到效果。。。
 */
public class JavaVMStackOOM {

    private void dontStop() {
        while (true) {
        }
    }

    public void stackLeakByThread() {
        while (true) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    dontStop();
                }
            });
            thread.start();
        }
    }

    public static void main(String[] args) {
        JavaVMStackOOM vmStackOOM = new JavaVMStackOOM();
        vmStackOOM.stackLeakByThread();
    }
}

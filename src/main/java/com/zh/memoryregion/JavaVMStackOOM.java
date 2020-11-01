package com.zh.memoryregion;

/**
 * 栈 OutOfMemoryError
 * 通过不断的创建线程达到目的
 *
 * 实测不管怎么设置下面参数，无法出现OOM，可能64位单个进程内存过大，待查
 * 
 * 
 * VM Args: -Xss2m
 *
 * @Author zh2683
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
        JavaVMStackOOM javaVMStackOOM = new JavaVMStackOOM();
        javaVMStackOOM.stackLeakByThread();
    }

}

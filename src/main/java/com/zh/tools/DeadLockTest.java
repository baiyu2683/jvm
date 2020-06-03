package com.zh.tools;

import java.io.IOException;

/**
 * 死锁例子
 */
public class DeadLockTest {

    private final static Object first = new Object();
    private final static Object second = new Object();

    public static void main(String[] args) throws IOException, InterruptedException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (first) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (second) {
                        System.out.println(1);
                    }
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (second) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (first) {
                        System.out.println(2);
                    }
                }
            }
        }).start();
        Thread.sleep(1);
    }
}

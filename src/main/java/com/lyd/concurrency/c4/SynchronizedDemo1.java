package com.lyd.concurrency.c4;

/**
 * @author lyd
 */
public class SynchronizedDemo1 {

    public static void main(String[] args) {
        synchronized (SynchronizedDemo1.class) {
        }
        method();
    }

    private static void method() {
    }
}

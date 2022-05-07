package com.lyd.concurrency.c4;

/**
 * @author lyd
 */
public class SynchronizedDemo2 implements Runnable {

    private static int count = 0;

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new SynchronizedDemo2());
            thread.start();
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("result: " + count);
    }

    @Override
    public void run() {
        synchronized (SynchronizedDemo2.class) {
            for (int i = 0; i < 1000000; i++)
                count++;
        }
    }
}

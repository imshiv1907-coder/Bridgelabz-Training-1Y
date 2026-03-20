package com.gla.work.MultiThreading;

public class MyThread6 extends Thread {
    public void run() {
        for (int i = 10; i >= 1; i--) {
            System.out.println("Thread: " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}


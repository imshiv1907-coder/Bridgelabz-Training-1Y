package com.gla.work.MultiThreading;

public class MyThread5 implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread: " + i);
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
        public static void main(String[] args){
          MyThread5     myThread = new MyThread5();
          Thread t= new Thread(myThread);
                  t.start();

                  MyThread6 myThread6 = new MyThread6();
                  myThread6.start();
        }

}

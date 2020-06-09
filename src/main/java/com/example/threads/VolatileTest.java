package com.example.threads;

public class VolatileTest extends Thread{

    private static volatile boolean flag = false;

    public void run(){
        while(!flag);
    }

    public static void main(String[] args) throws InterruptedException {
        new VolatileTest().start();
        Thread.sleep(2000);
        flag=true;
    }
}

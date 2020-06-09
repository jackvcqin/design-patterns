package com.example.threads;

import java.util.Random;

public class MainTest {

    public static volatile boolean flag=true;

    public static void main(String[] args) throws Exception {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (flag){
                    try {
                        System.out.println(Random.class.newInstance().nextInt());
                    } catch (InstantiationException e) {
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName()+"线程停止，死循环被打开");
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                flag = false;
                System.out.println(Thread.currentThread().getName()+"修改flag为"+flag);
            }
        }).start();

        Thread.sleep(Integer.MAX_VALUE);
    }
}

package com.hkd.test;

public class test {
    public static void main(String[] args) {
        Thread t=new Thread(){
            @Override
            public void run() {
                m1();
            }
        };
        //t.run();
        System.out.println("hello");
        t.start();
        System.out.println("he");
        System.out.println("hi");
        for (int i = 0; i < 100; i++) {
            System.out.println("main"+i);
        }
    }
    static  synchronized void m1(){
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}

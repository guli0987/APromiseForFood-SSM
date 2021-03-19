package com.hkd.test;

import com.hkd.domain.TestB;

class TestA extends TestB{
    int e=5;
    void testA(){
        System.out.println(super.c);
        System.out.println(super.d);
    }



}
public class TestClass {
    public static void main(String[] args) {
        TestA testA=new TestA();
        testA.testA();
        System.out.println(testA.e);
        TestB testB=new TestB();
        System.out.println(testB.d);
    }



}

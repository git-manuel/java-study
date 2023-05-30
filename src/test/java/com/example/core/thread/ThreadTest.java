package com.example.core.thread;

public class ThreadTest {

    public void testThreadLocal(){

        ThreadLocal<String> threadLocal = ThreadLocal.withInitial(()->"");

    }






}

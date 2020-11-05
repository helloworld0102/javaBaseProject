package com.thread;

/*
currentThread()方法测试
分别在构造方法和run方法打印线程名称
 */
public class Code4MethodCurrentThread extends Thread {
    public Code4MethodCurrentThread(){
        System.out.println("构造方法方法打印当前线程"+Thread.currentThread());
    }

    @Override
    public void run() {
        System.out.println("run方法打印当前线程"+Thread.currentThread());
    }

    public static void main(String[] args) {
        System.out.println("main方法打印当前线程"+Thread.currentThread());
        //main线程中调用构造方法，所以当前线程为main
        Code4MethodCurrentThread thread=new Code4MethodCurrentThread();

        thread.start();
        //main线程调用run方法，没有开启新的线程所以为main线程
        thread.run();
    }
}

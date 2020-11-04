package com.thread;
/*
*创建线程的方法1、继承Thread 类，重写run方法
* */
public class Code1ThreadCreate extends Thread{
    @Override
    public void run() {
        System.out.println("这是子线程");
    }

    public static void main(String[] args) {
        System.out.println("JVM启动主线程，执行main方法");
        //创建子线程对象
        Code1ThreadCreate thread =new Code1ThreadCreate ();
        //启动线程，调用start方法启动线程，实质为请求java虚拟机运行线程，具体什么时候执行由线程调度器决定
        thread.start();//并不意味着线程已经执行，线程开始时执行run方法，如果开启多个线程，start调用顺序不一定时启动顺序
        System.out.println("main线程后面的代码。。"); //可能先执行这一句，再执行子线程，多线程运行结果与代码顺序无关
    }
}

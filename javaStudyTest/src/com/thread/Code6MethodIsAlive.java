package com.thread;
//isAlive 判断线程是否存活
public class Code6MethodIsAlive extends Thread{
    @Override
    public void run() {
        System.out.println("run方法，isAlive="+this.isAlive());//运行状态返回true
    }

    public static void main(String[] args) {
        Code6MethodIsAlive thread =new Code6MethodIsAlive();
        System.out.println("begin="+thread.isAlive());//启动线程前，肯定为false
        thread.start();
        System.out.println("end="+thread.isAlive());//结果不一定，打印这一行时，如果子线程没结束，就是true，否则是false


    }
}

package com.thread.ThreadExpands;
/*
setPriority(num)设置线程的优先级  num：[1,10],线程优先级有继承性，开发时基本不设置，默认为5
 */
public class Code002MethodSetPriority extends Thread{
    @Override
    public void run() {
        long begin =System.currentTimeMillis();
        long sum=0;
        for (long i = 0L; i < 10000000000L; i++) {
            sum+=i;
        }
        long end =System.currentTimeMillis();
        System.out.println(Thread.currentThread().getName()+"耗时"+(end-begin));
    }

    public static void main(String[] args) {
        Code002MethodSetPriority threadA=new Code002MethodSetPriority();
        threadA.setPriority(1);
        threadA.start();
        Code002MethodSetPriority threadB=new Code002MethodSetPriority();
        threadB.setPriority(10);
        threadB.start();

    }
}

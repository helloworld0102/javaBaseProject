package com.thread.ThreadExpands;
/*
yield(放弃当前的cpu资源
 */
public class Code001MethodYield extends Thread{
    @Override
    public void run() {
        long begin=System.currentTimeMillis();
        long sum=0;
        for(int i=1;i<=1000000;i++){
            sum+=i;
            Thread.yield();  //放弃cpu执行权
        }
        long end =System.currentTimeMillis();
        System.out.println("用时"+(end-begin));
    }

    public static void main(String[] args) {
        //开启子线程，计算累加和
        Code001MethodYield thread =new Code001MethodYield();
        thread.start();
        //main线程计算累加和
        long begin=System.currentTimeMillis();
        long sum=0;
        for(int i=1;i<=1000000;i++){
            sum+=i;
        }
        long end =System.currentTimeMillis();
        System.out.println("main用时"+(end-begin));


    }
}

package com.thread;
//多线程运行结果是随机
public class Code2ThreadRandom  extends Thread{
    @Override
    public void run() {
        try {
            for (int i = 0; i <10 ; i++) {
                System.out.println("子线程"+i);
                int time=(int)Math.random()*1000;
                Thread.sleep(time);              //线程睡眠
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Code2ThreadRandom thread=new Code2ThreadRandom();
        thread.start(); //子线程启动

        //主线程
        try {
            for (int i = 0; i <10 ; i++) {
                System.out.println("主线程"+i);
                int time=(int)Math.random()*1000;
                Thread.sleep(time);              //线程睡眠
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

package com.thread.ThreadExpands;
/*
*   setDaemon() 设置守护线程，守护线程不能独自运行
 */
public class Code004MethodSetDaemon extends Thread{
    @Override
    public void run() {
        while(true){
            System.out.println("sub thread...");
        }
    }

    public static void main(String[] args) {
        Code004MethodSetDaemon thread =new Code004MethodSetDaemon();
        //设置线程为守护线程,销毁需要一定的时间，所以在其他线程完成后这个守护线程会执行一小会
        thread.setDaemon(true);//在启动前设置守护线程
        thread.start();

        //当前线程为main线程
        for (int i = 0; i < 10; i++) {
            System.out.println("main"+i);
        }
    }
}

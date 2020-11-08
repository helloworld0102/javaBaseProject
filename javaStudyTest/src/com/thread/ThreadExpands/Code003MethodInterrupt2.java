package com.thread.ThreadExpands;
/*
interrupt（） 仅仅是在当前线程打一个停止标志，并不是真正的停止线程
 */
public class Code003MethodInterrupt2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            if(this.isInterrupted()){//根据中断标志，来决定是否退出子线程
                System.out.println("当前线程中断标志为true,我要退出了");
                break;
            }
            System.out.println("subThread-->"+i);
        }
    }

    public static void main(String[] args) {
        Code003MethodInterrupt2 thread =new Code003MethodInterrupt2();
        thread.start();

        //当前为main线程
        for (int i = 0; i < 10000; i++) {
            System.out.println("mainThread-->"+i);
        }

        thread.interrupt();
        System.out.println("已经给子线程发出中断标志了");
    }
}

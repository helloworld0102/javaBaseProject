package com.thread.ThreadExpands;
/*
interrupt（） 仅仅是在当前线程打一个停止标志，并不是真正的停止线程
 */
public class Code003MethodInterrupt extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("subThread-->"+i);
        }
    }

    public static void main(String[] args) {
        Code003MethodInterrupt thread =new Code003MethodInterrupt();
        thread.start();

        //当前为main线程
        for (int i = 0; i < 10000; i++) {
            System.out.println("mainThread-->"+i);
        }

        thread.interrupt();
        System.out.println("已经给子线程发出中断标志了");
    }
}

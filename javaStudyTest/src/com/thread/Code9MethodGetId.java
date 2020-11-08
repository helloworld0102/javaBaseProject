package com.thread;
/*
getId()获得线程的唯一标识
 */
public class Code9MethodGetId extends Thread{
    @Override
    public void run() {
        System.out.println("thread name="+Thread.currentThread().getName()+",id="+this.getId());
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+",id="+Thread.currentThread().getId());
        //子线程的id,某个编号的线程运行结束后，该编号可能被后续创建的线程使用
        for(int i=1;i<=5;i++){
            new Code9MethodGetId().start();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

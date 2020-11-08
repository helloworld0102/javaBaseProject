package com.thread;
/*
    使用线程休眠完成简易计时器
 */
public class Code8MethodSleep2 extends Thread {
    @Override
    public void run() {
        super.run();
    }

    public static void main(String[] args) {
        int remaining =10;//从60秒开始计时
        if(args.length==1){
            remaining=Integer.parseInt(args[0]);
        }
        while(true){
            System.out.println("还剩"+remaining+"秒");
            remaining--;
            if(remaining<0){
                break;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("done");
    }
}

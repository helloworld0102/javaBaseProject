package com.thread;
//实现runnable接口创建线程，当类已经继承了一个父类
public class Code3RunnableImplements implements Runnable{
    //重写run方法，run()就是子线程执行的代码
    @Override
    public void run() {
        for(int i=1;i<=100;i++){
            System.out.println("subThread"+i);
        }
    }

    public static void main(String[] args) {
        //创建Runnable接口的实现类对象
        Code3RunnableImplements runnable =new Code3RunnableImplements();
        //创建线程对象
        Thread thread =new Thread(runnable);
        //开启线程
        thread.start();

        //main线程
        for(int i=1;i<=100;i++){
            System.out.println("main"+i);
        }
        //匿名内部类定义线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<=100;i++){
                    System.out.println("subThread2------"+i);
                }
            }
        }).start();
    }
}

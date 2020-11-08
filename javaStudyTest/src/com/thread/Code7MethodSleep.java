package com.thread;
//Thread.sleep(毫秒数)
//当前线程休眠指定毫秒数，当前线程指的是Thread.currentThread（）返回的线程
public class Code7MethodSleep extends Thread {
    @Override
    public void run() {//异常不能抛出，因为父类的run方法没有抛出异常，子类也不能抛出异常
        System.out.println("run方法，ThreadName="+Thread.currentThread().getName()+",begin,开始时间"+System.currentTimeMillis());
        try {
            Thread.sleep(2000); //当前线程休眠2000毫秒
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("run方法，ThreadName="+Thread.currentThread().getName()+",end,结束时间"+System.currentTimeMillis());
    }

    public static void main(String[] args) {
        Code7MethodSleep thread =new Code7MethodSleep();
        System.out.println("main_begin"+System.currentTimeMillis());
//        thread.start();
        thread.run();//不会开启新的线程，相当于主线程休眠2000ms
        System.out.println("main_end"+System.currentTimeMillis());
    }
}

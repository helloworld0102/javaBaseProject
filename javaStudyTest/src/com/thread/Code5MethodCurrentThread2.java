package com.thread;

public class Code5MethodCurrentThread2 extends Thread{
    public Code5MethodCurrentThread2(){
        System.out.println("构造方法Thread.currentThread().getName()"+Thread.currentThread().getName());
        System.out.println("构造方法中this.getName()"+this.getName());
    }

    @Override
    public void run() {
        System.out.println("run方法Thread.currentThread().getName()"+Thread.currentThread().getName());
        System.out.println("run方法中this.getName()"+this.getName());
    }

    public static void main(String[] args) throws InterruptedException{
        //创建子线程对象
        //main调用构造方法，所以currentThread输出main线程，this.name输出Thread-0,默认的线程名
        Code5MethodCurrentThread2 thread =new Code5MethodCurrentThread2();
        //设置线程名称
        thread.setName("t2");

        //启动后执行run方法，当前线程和this都是子线程
        thread.start();

        thread.sleep(500);//main线程睡眠500ms

        //因为Thread实现了Runnable接口，所以Thread构造方法中可以传一个Thread对象
        Thread t3=new Thread(thread);
         /*
        public Thread(Runnable target) {
            init(null, target, "Thread-" + nextThreadNum(), 0);
         }
         创建线程时构造方法中会给线程名称，不用Runnbale接口中的名字。所以当前线程名称不是thread的名字
         public void run() {
            if (target != null) {
            target.run();
            }
        }
         当传入的Runnable不为null时，启动线程调用的是Runubale实现类的run方法，那这个this就指向了Runnable接口
         对象（即thread对象），那this.getName()获得的也就是thread对象的name，即t2
         */
        t3.start();

    }
}

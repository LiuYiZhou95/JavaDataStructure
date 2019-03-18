package com.Synchronized;

/**
 * @author action.zhou
 * @version v1.0
 * @date Created in 2019/3/13
 * @description
 */
public class AppMain {

    public static void main(String[] args) {
        /**
         * 当两个并发线程(thread1和thread2)访问同一个对象(syncThread)中的synchronized代码块时，
         * 在同一时刻只能有一个线程得到执行，另一个线程受阻塞，
         * 必须等待当前线程执行完这个代码块以后才能执行该代码块。
         * Thread1和thread2是互斥的，因为在执行synchronized代码块时会锁定当前的对象，
         * 只有执行完该代码块才能释放该对象锁，下一个线程才能执行并锁定该对象。
         * */
//        MyThread syncThread = new MyThread();
//        Thread thread1 = new Thread(syncThread, "SyncThread1");
//        Thread thread2 = new Thread(syncThread, "SyncThread2");
//        thread1.start();
//        thread2.start();

        /**
         *因为synchronized只锁定对象，每个对象都有一个锁（lock）与之相关联
         * 这把锁只锁了MyThread()对象，thread3 thread4有两个不同的对象
         * */
        Thread thread3 = new Thread(new MyThread(), "SyncThread3");
        Thread thread4 = new Thread(new MyThread(), "SyncThread4");
        thread3.start();
        thread4.start();

        /**
         *等同于上面的代码
         * */
//        MyThread syncThread3 = new MyThread();
//        MyThread syncThread4= new MyThread();
//        Thread thread3 = new Thread(syncThread3, "SyncThread3");
//        Thread thread4 = new Thread(syncThread4, "SyncThread4");
//        thread1.start();
//        thread2.start();
    }


}
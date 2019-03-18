package com.Synchronized;
/**
 * @author action.zhou
 * @version v1.0
 * @date Created in 2019/3/13
 * @description同步线程
 */

class MyThread implements Runnable {
    private static int count;

    public MyThread() {
        count = 0;
    }

    public  void run() {
        synchronized(this) {
            for (int i = 0; i < 5; i++) {
                try {
                    System.out.println(Thread.currentThread().getName() + ":" + (count++));
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public int getCount() {
        return count;
    }
}

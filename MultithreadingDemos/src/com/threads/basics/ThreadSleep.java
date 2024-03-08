package com.threads.basics;

public class ThreadSleep {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println(thread);
        thread.setName("poppy");
        thread.setPriority(Thread.MIN_PRIORITY);
        System.out.println(thread);
        thread.setName("sam");
//        int[] nums = null;
//        System.out.println(nums[0]);
        for (int i=0;i<10;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

package com.threads.basics;

public class ThreadMain {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println(thread);
        thread.setName("poppy");
        thread.setPriority(Thread.MIN_PRIORITY);
        System.out.println(thread);
        thread.setName("sam");
        int[] nums = null;
        System.out.println(nums[0]);
    }
}

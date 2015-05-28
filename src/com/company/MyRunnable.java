package com.company;

public class MyRunnable implements Runnable {
    private long countUntil;

    MyRunnable(long countUntil) {
        this.countUntil = countUntil;
    }

    @Override
    public void run() {
        long sum = 0;
        for (long i = 1; i < 1000000000; i++) {
            sum += i;
        }
        System.out.println(countUntil);
    }
}
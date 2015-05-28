package com.company;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Subscriber {
    private static final int NTHREDS = 10;

    public static void subscribe(MessageBroker messageBroker) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(NTHREDS);
        for (int i = 0; i < 5; i++) {
            Runnable worker = new MyReceivable(i, messageBroker);
            executor.execute(worker);
        }
        executor.shutdown();
        executor.awaitTermination(10 , TimeUnit.SECONDS);
        System.out.println("Finished all threads");
    }
}

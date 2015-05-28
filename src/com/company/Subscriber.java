package com.company;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Subscriber {

    public void subscribe(MessageBroker messageBroker) throws InterruptedException {

        final int NTHREDS = 5;

        ExecutorService executor = Executors.newFixedThreadPool(NTHREDS);

        for (int i = 0; i < NTHREDS; i++) {

            Runnable worker = new MyReceivable(i, messageBroker);

            executor.execute(worker);

        }
        executor.shutdown();

        executor.awaitTermination(10, TimeUnit.SECONDS);

        System.out.println("\n\nFinished all threads");
    }
}

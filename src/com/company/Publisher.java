package com.company;

import java.util.ArrayList;
import java.util.List;

public class Publisher {
    public void publishInformation(MessageBroker messageBroker) {
        List<Thread> threads = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Runnable task = new MyRunnable(i, messageBroker);
            Thread worker = new Thread(task);

            worker.setName(String.valueOf(i));

            worker.start();

            threads.add(worker);
        }
        int running;
        do {
            running = 0;
            for (Thread thread : threads) {
                if (thread.isAlive()) {
                    running++;
                }
            }
        } while (running > 0);
    }
}

package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        MessageBroker messageBroker = new MessageBroker(queue);
        publishInformation(messageBroker);
    }

    private static void publishInformation(MessageBroker messageBroker) {
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

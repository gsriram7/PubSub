package com.company;

public class MyRunnable implements Runnable {
    private Integer id;
    MessageBroker messageBroker;

    MyRunnable(Integer id, MessageBroker messageBroker) {
        this.id = id;
        this.messageBroker = messageBroker;
    }

    @Override
    public void run() {
        long sum = 0;
        for (long i = 1; i < 1000000000; i++) {
            sum += i;
        }
        try {
            Thread.sleep(Long.parseLong(id.toString()));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        messageBroker.messageQueue.add(id.toString());
        System.out.println(id);
    }
}

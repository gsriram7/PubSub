package com.company;

public class MyPublishable implements Runnable {
    private Integer id;
    MessageBroker messageBroker;

    MyPublishable(Integer id, MessageBroker messageBroker) {
        this.id = id;
        this.messageBroker = messageBroker;
    }

    @Override
    public void run() {
        for (long i = 1; i < 1000000000; i++) {
        }
        try {
            Thread.sleep(Long.parseLong(id.toString()));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        messageBroker.messageQueue.add(id.toString());
    }
}

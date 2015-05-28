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
            //Just to simulate threads getting executed at different order
        }
        messageBroker.messageQueue.add(id.toString());
    }
}

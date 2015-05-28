package com.company;

public class MyReceivable implements Runnable {
    private Integer id;
    MessageBroker messageBroker;

    public MyReceivable(Integer id, MessageBroker messageBroker) {
        this.id = id;
        this.messageBroker = messageBroker;
    }

    @Override
    public void run() {
        String message = "";
        while (!id.toString().equals(message)) {
            message = messageBroker.messageQueue.peek();
        }
        System.out.println("Message for id:" + id + " is " + messageBroker.messageQueue.poll());
    }
}

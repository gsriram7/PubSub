package com.company;

import java.util.Queue;

public class MessageBroker {
    public Queue<String> messageQueue;

    public MessageBroker(Queue<String> messageQueue) {
        this.messageQueue = messageQueue;
    }

}

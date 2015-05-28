package com.company;

import java.util.Queue;

public class MessageBroker {
    public Queue<String> messageQueue;

    public MessageBroker(Queue<String> messageQueue, boolean allowRead, boolean allowWrite) {
        this.messageQueue = messageQueue;
    }

}

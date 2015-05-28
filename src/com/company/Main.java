package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Publisher publisher = new Publisher();
        MessageBroker messageBroker = new MessageBroker(new LinkedList<String>());
        publisher.publishInformation(messageBroker);
        System.out.println("Message queue:"+messageBroker.messageQueue+"\n\n");
        Subscriber subscriber = new Subscriber();
        subscriber.subscribe(messageBroker);
    }
}
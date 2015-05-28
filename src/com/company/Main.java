package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        Publisher publisher = new Publisher();
        MessageBroker messageBroker = new MessageBroker(new LinkedList<String>());
        publisher.publishInformation(messageBroker);
        System.out.println(messageBroker.messageQueue);
    }
}
package com.example.designpatterns.creational.factory;

public class SendMessage {
    public static void main(String[] args) {

//        With Factory Pattern
        MessageChannelFactory messageFactory = new MessageChannelFactory();
        messageFactory.setChannelName("sms");
        MessageChannel messageChannel = messageFactory.getMessageChannel();
        messageChannel.send();

//        Without Factory Pattern
    }
}

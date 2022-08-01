package com.example.designpatterns.creational.factory;

public class SendMessage {
    public static void main(String[] args) {
        GetMessageFactory messageFactory = new GetMessageFactory();
        messageFactory.setChannelName("sms");
        MessageChannel messageChannel = messageFactory.getMessageChannel();
        messageChannel.send();
    }
}

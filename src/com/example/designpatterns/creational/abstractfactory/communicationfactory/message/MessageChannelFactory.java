package com.example.designpatterns.creational.abstractfactory.communicationfactory.message;

import com.example.designpatterns.creational.abstractfactory.communicationfactory.AbstractChannelFactory;
import com.example.designpatterns.creational.abstractfactory.communicationfactory.calling.CallingChannel;

public class MessageChannelFactory implements AbstractChannelFactory {

    private String channelName;

    public MessageChannelFactory(String channelName) {
        this.channelName = channelName;
    }

    public MessageChannelFactory() {
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    @Override
    public MessageChannel getMessageChannel(){
        switch (this.channelName){
            case "sms":
                return new SmsChannel();
            case "email":
                return new EmailChannel();
            default:
                throw new IllegalArgumentException("Unknown Channel"+this.channelName);
        }
    }

    @Override
    public CallingChannel getCallingChannel() {
        return null;
    }
}

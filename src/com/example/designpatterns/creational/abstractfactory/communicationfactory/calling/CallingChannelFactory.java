package com.example.designpatterns.creational.abstractfactory.communicationfactory.calling;

import com.example.designpatterns.creational.abstractfactory.communicationfactory.AbstractChannelFactory;
import com.example.designpatterns.creational.abstractfactory.communicationfactory.message.MessageChannel;

public class CallingChannelFactory implements AbstractChannelFactory {

    private String channelName;

    public CallingChannelFactory(String channelName) {
        this.channelName = channelName;
    }

    public CallingChannelFactory() {
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    @Override
    public MessageChannel getMessageChannel() {
        return null;
    }

    @Override
    public CallingChannel getCallingChannel(){
        switch (this.channelName){
            case "whatsapp":
                return new WhatsappChannel();
            case "skype":
                return new SkypeChannel();
            default:
                throw new IllegalArgumentException("Unknown Channel"+this.channelName);
        }
    }
}

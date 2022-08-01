package com.example.designpatterns.creational.factory;

public class GetMessageFactory {

    private String channelName;

    public GetMessageFactory(String channelName) {
        this.channelName = channelName;
    }

    public GetMessageFactory() {
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

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
}

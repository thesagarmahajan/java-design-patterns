package com.example.designpatterns.creational.abstractfactory;

import com.example.designpatterns.creational.abstractfactory.communicationfactory.AbstractChannelFactory;
import com.example.designpatterns.creational.abstractfactory.communicationfactory.calling.CallingChannelFactory;
import com.example.designpatterns.creational.abstractfactory.communicationfactory.message.MessageChannelFactory;

public class FactoryCreator {

    private String factoryName;
    private String channelName;


    public FactoryCreator(String factoryName, String channelName) {
        this.channelName = channelName;
        this.factoryName = factoryName;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public AbstractChannelFactory getFactory(){
        switch (this.factoryName){
            case "call":
                return new CallingChannelFactory(this.channelName);
            case "message":
                return new MessageChannelFactory(this.channelName);
            default:
                throw new IllegalArgumentException("Unknown Channel"+factoryName);
        }
    }
}

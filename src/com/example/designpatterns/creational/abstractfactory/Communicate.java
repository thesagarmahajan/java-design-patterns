package com.example.designpatterns.creational.abstractfactory;

import com.example.designpatterns.creational.abstractfactory.communicationfactory.AbstractChannelFactory;
import com.example.designpatterns.creational.abstractfactory.communicationfactory.calling.CallingChannel;
import com.example.designpatterns.creational.abstractfactory.communicationfactory.message.MessageChannel;

public class Communicate {
    public static void main(String[] args) {
//        Abstract Factory
        FactoryCreator factoryCreator = new FactoryCreator("message", "email");
        AbstractChannelFactory factory = factoryCreator.getFactory();
        System.out.println(factory.toString());
        MessageChannel c = factory.getMessageChannel();
        c.send();
    }
}

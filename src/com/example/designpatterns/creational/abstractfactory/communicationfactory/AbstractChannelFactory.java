package com.example.designpatterns.creational.abstractfactory.communicationfactory;

import com.example.designpatterns.creational.abstractfactory.communicationfactory.calling.CallingChannel;
import com.example.designpatterns.creational.abstractfactory.communicationfactory.message.MessageChannel;

public interface AbstractChannelFactory {
    public MessageChannel getMessageChannel();
    public CallingChannel getCallingChannel();
}

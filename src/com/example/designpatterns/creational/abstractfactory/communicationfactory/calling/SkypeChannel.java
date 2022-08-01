package com.example.designpatterns.creational.abstractfactory.communicationfactory.calling;

public class SkypeChannel implements CallingChannel {
    @Override
    public void call() {
        System.out.println("Calling via Skype");
    }
}

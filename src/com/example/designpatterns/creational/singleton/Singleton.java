package com.example.designpatterns.creational.singleton;

public class Singleton {
    private static Singleton singleton;

//    Private constructor to prevent an object of the class from being created
    private Singleton(){

    }

//    Singleton object factory
    public static Singleton getSingleton(){
        if(singleton==null){
            singleton = new Singleton();
        }
        return singleton;
    }

    public void doSomething(){
        System.out.println("Doing Something");
    }
}

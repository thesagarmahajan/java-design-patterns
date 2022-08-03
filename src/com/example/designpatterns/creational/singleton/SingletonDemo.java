package com.example.designpatterns.creational.singleton;

public class SingletonDemo {
    public static void main(String[] args) {
//        Singleton s = new Singleton();
//        Singleton s2 = new Singleton();
//        System.out.println(s.equals(s2)); // false

        Singleton s = Singleton.getSingleton();
        Singleton s2 = Singleton.getSingleton();
        System.out.println(s.equals(s2)); // true
    }
}

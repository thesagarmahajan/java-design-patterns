package com.example.designpatterns.creational.prototype;

public class PrototypePatternDemo {
    public static void main(String[] args) {
        User user = new User("Sagar Mahajan", "sagar@gmail.com", 100000);
        User userClone = (User) user.getClone();
        User userClone1 = user;

        System.out.println(user.equals(userClone)); // False
        System.out.println(user.equals(userClone1)); // True
    }
}

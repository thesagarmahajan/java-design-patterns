package com.example.designpatterns.creational.builder;

public class BurgerBuilderDemo {
    public static void main(String[] args) {
        Burger burger = new Burger.BurgerBuilder("Aloo Tikki Burger", "regular").setIsExtraCheese(true).setIsItAMeal(true).setIsTakeAway(true).build();
        System.out.println(burger.toString());
    }
}

package com.example.designpatterns.creational.builder;

public class Burger {

    private String name;
    private String size;
    private boolean isExtraCheese;
    private boolean isItAMeal;
    private boolean isTakeAway;

    public boolean isExtraCheese() {
        return isExtraCheese;
    }

    public boolean isItAMeal() {
        return isItAMeal;
    }

    public boolean isTakeAway() {
        return isTakeAway;
    }

    public Burger(BurgerBuilder burgerBuilder) {
        this.name = burgerBuilder.name;
        this.size = burgerBuilder.size;
        this.isExtraCheese = burgerBuilder.isExtraCheese;
        this.isItAMeal = burgerBuilder.isItAMeal;
        this.isTakeAway = burgerBuilder.isTakeAway;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", isExtraCheese=" + isExtraCheese +
                ", isItAMeal=" + isItAMeal +
                ", isTakeAway=" + isTakeAway +
                '}';
    }

    public static class BurgerBuilder{
        private String name;
        private String size;
        private boolean isExtraCheese;
        private boolean isItAMeal;
        private boolean isTakeAway;

        public BurgerBuilder(String name, String size) {
            this.name = name;
            this.size = size;
        }

        public BurgerBuilder setIsExtraCheese(boolean isExtraCheese){
            this.isExtraCheese = isExtraCheese;
            return this;
        }

        public BurgerBuilder setIsItAMeal(boolean isItAMeal){
            this.isItAMeal = isItAMeal;
            return this;
        }

        public BurgerBuilder setIsTakeAway(boolean isTakeAway){
            this.isTakeAway = isTakeAway;
            return this;
        }

        public Burger build(){
            return new Burger(this);
        }
    }
}

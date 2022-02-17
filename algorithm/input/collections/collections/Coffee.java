package com.java.Study.collections;

public class Coffee implements Comparable<Coffee>{
    private String coffeeName;
    private int coffeePrice;

    public Coffee(String coffeeName, int coffeePrice) {
        this.coffeeName = coffeeName;
        this.coffeePrice = coffeePrice;
    }

    public String getCoffeeName() {
        return coffeeName;
    }

    public int getCoffeePrice() {
        return coffeePrice;
    }

    @Override
    public int compareTo(Coffee coffee) {
        return coffee.getCoffeePrice() - getCoffeePrice();
    }

}
//    @Override
//    public int compareTo(Coffee coffee) {
//        return coffeeName.compareTo(coffee.getCoffeeName());
//    }

package com.java.Study.collections;

import java.util.ArrayList;
import java.util.Collections;

public class CafeMenu {
    public static void main(String[] args) {

        ArrayList<Coffee> coffeeList = new ArrayList<>();

        coffeeList.add(new Coffee("Cafe Mocha", 4500));
        coffeeList.add(new Coffee("Americano", 4500));
        coffeeList.add(new Coffee("Mocha chino", 5100));
        coffeeList.add(new Coffee("Cafe Latte", 4900));


        Collections.sort(coffeeList);
        for (int i = 0; i < coffeeList.size(); i++) {
            System.out.println(coffeeList.get(i).getCoffeeName() + " " + coffeeList.get(i).getCoffeePrice());
        }
    }
}
//        Collections.sort(coffeeList);
//        for (int i = 0; i < coffeeList.size(); i++) {
//            System.out.println(coffeeList.get(i).getCoffeeName() + " " + coffeeList.get(i).getCoffeePrice());
//        }

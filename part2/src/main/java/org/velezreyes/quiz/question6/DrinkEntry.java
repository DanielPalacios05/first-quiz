package org.velezreyes.quiz.question6;

public class DrinkEntry {
    private Drink drink;
    private double price;

    public DrinkEntry(Drink drink, double price){
        this.drink = drink;
        this.price = price;
    }

    public Drink getDrink(){
        return this.drink;
    }

    public double getPrice(){
        return this.price;
    }

    
}

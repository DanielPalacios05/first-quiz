package org.velezreyes.quiz.question6;

import java.util.ArrayList;

public class VendingMachineImpl implements VendingMachine {

  private ArrayList<DrinkEntry> availableDrinks;
  private double moneyInMachine;

  public VendingMachineImpl(ArrayList<DrinkEntry> availableDrinks,double moneyInMachine){
      this.availableDrinks = availableDrinks;
  }


  public static VendingMachine getInstance() {

    ArrayList<DrinkEntry> myDrinks = new ArrayList<>();

    myDrinks.add(new DrinkEntry(new DrinkImpl("ScottCola", true),0.75));
    myDrinks.add(new DrinkEntry(new DrinkImpl("KarenTea", false),1));
    // Fix me!
    return new VendingMachineImpl(myDrinks,0);
  }

  @Override
  public void insertQuarter() {
    this.moneyInMachine += 0.25;
  }

  @Override
  public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException {

    DrinkEntry chosenDrink = findDrinkByName(name);

    if(chosenDrink == null){
      throw new UnknownDrinkException();
    }
    else if (chosenDrink.getPrice() > this.moneyInMachine){
      throw new NotEnoughMoneyException();
    }

    this.moneyInMachine -= chosenDrink.getPrice();

    return chosenDrink.getDrink();
  }

  private DrinkEntry findDrinkByName(String name){

    for (DrinkEntry actualDrink : availableDrinks) {

      if(actualDrink.getDrink().getName().equals(name)){
        return actualDrink;
      }
    }

    return null;
  }

}

package org.velezreyes.quiz.question6;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class VendingMachineImpl implements VendingMachine {

  private int balance; // This is the currentA vending machine that only accept quarters... :O
  private Map<String, AbstractMap.SimpleEntry<Integer, Boolean>> products; // Name: <Price, Fizziness???>

  public VendingMachineImpl()
  {
    this.balance = 0;
    this.products = new HashMap<>();
    this.products.put("ScottCola", new AbstractMap.SimpleEntry<>(75, true));
    this.products.put("KarenTea", new AbstractMap.SimpleEntry<>(100, false));
  }

  public void insertQuarter()
  {
    this.balance += 25;
  }

  public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException
  {
    if(this.products.containsKey(name))
    {
      if(this.balance >= this.products.get(name).getKey())
      {
           this.balance -= this.products.get(name).getKey();
           return new DrinkImpl(name, this.products.get(name).getValue());
      }
      else
        throw new NotEnoughMoneyException();
    }
    
    else throw new UnknownDrinkException();
  }

  public static VendingMachine getInstance() {
    return new VendingMachineImpl();
  }

}

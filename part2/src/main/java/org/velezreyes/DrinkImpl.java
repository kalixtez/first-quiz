package org.velezreyes;

import org.velezreyes.quiz.question6.Drink;

public class DrinkImpl implements Drink {
    
    String name;
    boolean is_fizzy;

    public DrinkImpl(String name, boolean is_fizzy)
    {
        this.name = name;
        this.is_fizzy = is_fizzy;
    }

    public String getName()
    {
        return this.name;
    }

    public boolean isFizzy()
    {
        return this.is_fizzy;
    }
}

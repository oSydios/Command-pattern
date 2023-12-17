package com.Filipe.Lab6;


public class StringBar extends Bar{
    boolean HappyHour;
    @Override
    public boolean isHappyHour() {
        return HappyHour;
    }

    @Override
    public void startHappyHour() {
        HappyHour=true;
        notifyObservers();
    }

    @Override
    public void endHappyHour() {
        HappyHour=false;
        notifyObservers();
    }
    public void order(StringDrink sd,StringRecipe sr)
    {
        sr.mix(sd);
    }
}

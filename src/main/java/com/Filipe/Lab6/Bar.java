package com.Filipe.Lab6;

import java.util.ArrayList;
import java.util.List;

public abstract class Bar {
    private final List<BarObserver> observers;
    public Bar(List<BarObserver> observers) {this.observers=observers;}
    public Bar(){this.observers=new ArrayList<>();}
    abstract public boolean isHappyHour();
    abstract public void startHappyHour();
    abstract public void endHappyHour();
    public void addObserver(BarObserver observer) {
        this.observers.add(observer);
    }
    public void removeObserver(BarObserver observer) {
        this.observers.remove(observer);
    }
    public void notifyObservers() {
        for (BarObserver observer : observers)
            if (isHappyHour()) observer.happyHourStarted(this);
            else observer.happyHourEnded(this);
    }
}

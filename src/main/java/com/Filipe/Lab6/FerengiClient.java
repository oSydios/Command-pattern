package com.Filipe.Lab6;

public class FerengiClient extends AlienClient{
    @Override
    protected OrderingStrategy createOrderingStrategy() {
        return new SmartStrategy();
    }
}

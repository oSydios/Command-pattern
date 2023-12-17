package com.Filipe.Lab6;
public class StringInverter implements StringTransformer{
    @Override
    public void execute(StringDrink drink) {
        String text = drink.getText();
        String reversed = new StringBuilder(text).reverse().toString();
        drink.setText(reversed);
    }

    @Override
    public void undo(StringDrink drink) {
        String text = drink.getText();
        String reversed = new StringBuilder(text).reverse().toString();
        drink.setText(reversed);
    }
}

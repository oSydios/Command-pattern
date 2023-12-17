package com.Filipe.Lab6;
import static java.lang.Character.isLowerCase;
import static java.lang.Character.toUpperCase;
import static java.lang.Character.toLowerCase;

public class StringCaseChanger implements StringTransformer{
    @Override
    public void execute(StringDrink drink) {
        String text= drink.getText();
        StringBuilder nt= new StringBuilder();
        for (char c : text.toCharArray()) {
            if(isLowerCase(c))
            {
                nt.append(toUpperCase(c));
            }
            else
            {
                nt.append(toLowerCase(c));
            }
        }
        drink.setText(nt.toString());
    }

    @Override
    public void undo(StringDrink drink) {
        String text= drink.getText();
        StringBuilder nt= new StringBuilder();
        for (char c : text.toCharArray()) {
            if(isLowerCase(c))
            {
                nt.append(toUpperCase(c));
            }
            else
            {
                nt.append(toLowerCase(c));
            }
        }
        drink.setText(nt.toString());
    }

}

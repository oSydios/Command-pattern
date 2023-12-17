package com.Filipe.Lab6;

public class StringReplacer implements StringTransformer{
    private char old_char;
    private char new_char;
    public StringReplacer(char old_char,char new_char)
    {
        this.old_char=old_char;
        this.new_char=new_char;
    }
    @Override
    public void execute(StringDrink drink) {
        String text= drink.getText();
        text=text.replace(old_char,new_char);
        drink.setText(text);
    }

    @Override
    public void undo(StringDrink drink) {
        String text= drink.getText();
        text=text.replace(new_char,old_char);
        drink.setText(text);
    }
}

package com.Filipe.Lab6;

import java.util.ArrayList;
import java.util.List;

public class SmartStrategy implements OrderingStrategy{
    public class want
    {
        private StringDrink drink;
        private StringRecipe recipe;
        private StringBar bar;

        public want(StringDrink drink,StringRecipe recipe,StringBar bar){this.bar=bar;this.drink=drink;this.recipe=recipe;}
        public StringBar getBarw() {
            return bar;
        }

        public StringDrink getDrinkw() {
            return drink;
        }

        public StringRecipe getRecipew() {
            return recipe;
        }
    }
    boolean happyhour=false;
    private List<want> querias_mas_nao_tens=new ArrayList<want>();
    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        happyhour=bar.isHappyHour();
        if(happyhour)
        {
            bar.order(drink,recipe);
        }
        else {
            querias_mas_nao_tens.add(new want(drink,recipe,bar));
        }
    }

    @Override
    public void happyHourStarted(StringBar bar) {
        happyhour=true;
        for(want x:querias_mas_nao_tens)
        {
            x.getBarw().order(x.getDrinkw(),x.getRecipew());
        }
    }

    @Override
    public void happyHourEnded(StringBar bar) {
        happyhour=false;
    }
}

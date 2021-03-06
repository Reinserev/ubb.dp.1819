package popa.catalin.lab1.domain.coffees;

import popa.catalin.lab1.domain.Coffee;
import popa.catalin.lab1.domain.Ingredient;

import java.util.Arrays;
import java.util.List;

public class Cappuccino extends Coffee {
    // Cappuccino: 2 cups water + 0.25 cups coffee-beans roasted + 100ml foamed milk
    public static List<Ingredient> getStandardIngredients() {
        return Arrays.asList(twoCupsWater, quarterCupBeansRoasted, hundredMLMilkFoamed);
    }

    @Override
    public String drink() {
        return "Relaxed milk coffee";
    }
}

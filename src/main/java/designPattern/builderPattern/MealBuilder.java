package designPattern.builderPattern;

import designPattern.builderPattern.burger.ChickenBurger;
import designPattern.builderPattern.burger.VegBurger;
import designPattern.builderPattern.coldDrink.Coke;
import designPattern.builderPattern.coldDrink.Pepsi;

/**
 * @Description:
 * @PackageName: designPattern.builderPattern
 * @Author: csc
 * @Create: 2020-07-31 17:47
 * @Version: 1.0
 */
public class MealBuilder {
    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}

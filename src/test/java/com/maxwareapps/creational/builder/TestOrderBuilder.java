package com.maxwareapps.creational.builder;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for Builder Design Pattern (Order Builder).
 *
 * The client asks the Builder to return the result.
 *
 */
public class TestOrderBuilder {

    @Test
    public void testBuilder(){
        Sandwich sandwish = new Sandwich(Sandwich.SandwichType.GRILLED,true);
        Drink drink = new Drink(Drink.DrinkType.COCK,true,true);
        IceCream iceCream = new IceCream(IceCream.IceCreamType.BIO,true,false,true);
        Salad salad = new Salad(Salad.SaladType.ITALIAN,true,false);
        Pizza pizza = new Pizza(Pizza.PizzaType.KEBAB,true);

        Order.Builder builder = new Order.Builder();
        Order order = builder.addDrink(drink)
                .addSandwish(sandwish)
                .addSalad(salad)
                .addIceCream(iceCream)
                .addPizza(pizza)
                .build();

        Assert.assertSame(sandwish,order.getSandwish());
        Assert.assertSame(drink,order.getDrink());
        Assert.assertSame(iceCream,order.getIceCream());
        Assert.assertSame(salad,order.getSalad());
        Assert.assertSame(pizza,order.getPizza());
    }
}

package com.maxwareapps.creational.builder;

public class Order {
    private Drink drink;
    private Sandwich sandwish;
    private Salad salad;
    private IceCream iceCream;
    private Pizza pizza;

    private Order() {}

    public Drink getDrink() {
        return drink;
    }

    public Sandwich getSandwish() {
        return sandwish;
    }

    public Salad getSalad() {
        return salad;
    }

    public IceCream getIceCream() {
        return iceCream;
    }

    public Pizza getPizza() {
        return pizza;
    }


    /**
     * Separate the construction of a complex object from its representation so that the same
     * construction process can create different representations.
     */
    public static class Builder{
        //Optional param
        private Order orderToBuild;

        public Builder(/*Required Params*/) {
            orderToBuild = new Order();
        }

        public Builder addDrink(Drink newDrink)
        {
            this.orderToBuild.drink = newDrink;
            return this;
        }

        public Builder addSandwish(Sandwich newSandwish)
        {
            this.orderToBuild.sandwish = newSandwish;
            return this;
        }

        public Builder addSalad(Salad newSalad)
        {
            this.orderToBuild.salad = newSalad;
            return this;
        }

        public Builder addIceCream(IceCream newIceCream)
        {
            this.orderToBuild.iceCream = newIceCream;
            return this;
        }

        public Builder addPizza(Pizza newPizza)
        {
            this.orderToBuild.pizza = newPizza;
            return this;
        }

        public Order build(){
            Order builtOrder = orderToBuild;
            orderToBuild = new Order();

            return builtOrder;
        }
    }

    @Override
    public String toString() {
        return "Order{" +
                "drink=" + drink +
                ", sandwish=" + sandwish +
                ", salad=" + salad +
                ", iceCream=" + iceCream +
                ", pizza=" + pizza +
                '}';
    }
}

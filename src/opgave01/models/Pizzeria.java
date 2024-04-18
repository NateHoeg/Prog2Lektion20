package opgave01.models;

import opgave01.models.pizzas.*;

public class Pizzeria {
    PizzaFactory factory;

    public Pizzeria(PizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}

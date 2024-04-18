package opgave02.models;

import opgave02.models.pizza.Pizza;
import opgave02.models.factories.SimplePizzaFactory;

public class Pizzeria {
    SimplePizzaFactory pizzaFactory;

    public Pizzeria(SimplePizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = pizzaFactory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}

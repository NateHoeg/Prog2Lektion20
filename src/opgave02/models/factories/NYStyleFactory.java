package opgave02.models.factories;

import opgave02.models.pizza.NYStyleCheesePizza;
import opgave02.models.pizza.NYStylePepperoniPizza;
import opgave02.models.pizza.NYStyleVegetarianPizza;
import opgave02.models.pizza.Pizza;

public class NYStyleFactory extends SimplePizzaFactory {

    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else if (type.equals("Vegetarian")) {
            return new NYStyleVegetarianPizza();
        } else {
            return null;
        }
    }
}

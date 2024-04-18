package opgave02.models.factories;

import opgave02.models.pizza.ChicagoStyleCheesePizza;
import opgave02.models.pizza.ChicagoStylePepperoniPizza;
import opgave02.models.pizza.ChicagoStyleVegetarianPizza;
import opgave02.models.pizza.Pizza;

public class ChicagoStyleFactory extends SimplePizzaFactory{
    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        } else if (type.equals("Vegetarian")) {
            return new ChicagoStyleVegetarianPizza();
        } else {
            return null;
        }

    }
}

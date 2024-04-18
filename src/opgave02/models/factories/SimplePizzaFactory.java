package opgave02.models.factories;

import opgave02.models.pizza.*;

public abstract class SimplePizzaFactory {
    public abstract Pizza createPizza(String type);
}

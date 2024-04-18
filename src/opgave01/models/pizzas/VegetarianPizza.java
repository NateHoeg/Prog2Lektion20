package opgave01.models.pizzas;

import java.util.List;

public class VegetarianPizza extends Pizza{
    public VegetarianPizza() {
        super("Vegetarian", List.of("Salad", "Olives"));
    }
}

package opgave01;

import opgave01.models.Pizzeria;
import opgave01.models.pizzas.PizzaFactory;

public class Opgave01 {
    public static void main(String[] args) {
        PizzaFactory factory = new PizzaFactory();
        Pizzeria pizzaria = new Pizzeria(factory);
        pizzaria.orderPizza("pepperoni");
    }

}

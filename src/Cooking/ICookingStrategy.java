package Cooking;

import pizzas.AbstractPizza;

public interface ICookingStrategy {
	
	public boolean cook(AbstractPizza pizza);

}

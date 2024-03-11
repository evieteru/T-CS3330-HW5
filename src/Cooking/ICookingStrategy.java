package Cooking;

import pizzas.AbstractPizza;

public interface ICookingStrategy {
	
	// This method will be implemented by all cooking strategy classes.
	public boolean cook(AbstractPizza pizza);

}

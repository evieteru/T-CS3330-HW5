package Cooking;

import pizzas.AbstractPizza;

public class MicrowaveOvenCookingStrategy {
	

	// Override interface cook method
	public boolean cook(AbstractPizza pizza) {
		
		// Ensure input parameter is a valid pizza
		if (pizza) {
			
			// Set cooking price
			pizza.setCookingPrice(1);
			// Add cooking price to total price
			pizza.updatePizzaPrice();
			// Set cooking strategy according to correct enum value
			pizza.setCookingStrategy(CookingStyleType.MICROWAVE);
			return true;
		}
		else {
			System.out.println("ERROR: Please enter a valid pizza to use cook().");
			return false;
		}
	}
}

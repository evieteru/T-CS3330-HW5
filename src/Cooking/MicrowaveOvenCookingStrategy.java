package Cooking;

import hw5.CookingStyleType;
import pizzas.AbstractPizza;

public class MicrowaveOvenCookingStrategy {
	
	public boolean cook(AbstractPizza pizza) {
		
		if(pizza != null) {
			
			pizza.setCookingStrategy(CookingStyleType.CONVENTIONAL_OVEN);
			
			pizza.setCookingPrice(1.0);
			pizza.updatePizzaPrice();
		
		return true;
		
		}
		
		return false; //assuming return false if can't cook
	}

}

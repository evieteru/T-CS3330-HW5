package Cooking;

import hw5.CookingStyleType;
import pizzas.AbstractPizza;

public class ConventionalOvenCookingStrategy {
	
	public boolean cook(AbstractPizza pizza) {
		
		if(pizza != null) {
		
			pizza.setCookingStrategy(CookingStyleType.CONVENTIONAL_OVEN);
			
			pizza.setCookingPrice(8.0);
			pizza.updatePizzaPrice();
		
			System.out.println("You selected Conventional Oven.");
			System.out.println("The new price of your " + pizza.getClass().getSimpleName() + " is " 
			                   + pizza.getTotalPrice());
			
		return true;
		
		}
		
		return false; //assuming return false if can't cook
	}

}

package Cooking;

import hw5.CookingStyleType;
import pizzas.AbstractPizza;

public class MicrowaveOvenCookingStrategy {
	
	public boolean cook(AbstractPizza pizza) {
		
		if(pizza != null) {
			
			pizza.setCookingStrategy(CookingStyleType.MICROWAVE);
			
			pizza.setCookingPrice(1.0);
			pizza.updatePizzaPrice();
			
			System.out.println("Really... you're microwaving your pizza? :/");
			System.out.println("The new price of your " + pizza.getClass().getSimpleName() + " is " 
			                   + pizza.getTotalPrice());
		
		return true;
		
		}
		
		return false; //assuming return false if can't cook
	}

}

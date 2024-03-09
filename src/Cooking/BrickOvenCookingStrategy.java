package Cooking;

import pizzas.*;

public class BrickOvenCookingStrategy implements ICookingStrategy{
	
	
		public boolean cook(AbstractPizza pizza) {
			
			pizza.setCookingPrice(10.0);
			pizza.updatePizzaPrice();
			
			return true;
		}
	

}

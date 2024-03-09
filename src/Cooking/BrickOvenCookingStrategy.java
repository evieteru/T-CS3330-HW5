package Cooking;

import hw5.CookingStyleType;
import pizzas.*;

public class BrickOvenCookingStrategy implements ICookingStrategy{
	
	
		public boolean cook(AbstractPizza pizza) {
			
			if(pizza != null) {
				
				pizza.setCookingStrategy(CookingStyleType.BRICK_OVEN);
				
				pizza.setCookingPrice(10.0);
				pizza.updatePizzaPrice();
				
				System.out.println("You selected Brick Oven!");
				System.out.println("The new price of your " + pizza.getClass().getSimpleName() + " is " 
				                   + pizza.getTotalPrice());
			
			return true;
			
			}
			
			return false; //assuming return false if can't cook
		}
	

}

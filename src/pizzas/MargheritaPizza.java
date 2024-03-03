package pizzas;

import java.util.List;

import Cooking.ICookingStrategy;
import hw5.Toppings;

public class MargheritaPizza extends AbstractPizza {
	
	
	//Constructor
		public MargheritaPizza(List<Toppings> toppingList, double priceWithoutToppings,
	            double totalPrice, int pizzaOrderID, ICookingStrategy cookingStrategy, double cookingPrice) {
			super(toppingList, totalPrice, pizzaOrderID, cookingStrategy, cookingPrice);
			
			this.priceWithoutToppings = 2.50;
			
			addDefaultToppings();
		}

		//Copy Constructor
		public MargheritaPizza(HawaiianPizza other) {
			super(other.getToppingList(), other.getTotalPrice(),
			   other.getPizzaOrderID(), other.getCookingStrategy(), other.getCookingPrice());
			
			this.priceWithoutToppings = 2.50;
			
			addDefaultToppings();
		}
		
		private void addDefaultToppings() {
			// Add default toppings: TOMATO, CHEESE
		    this.toppingList.add(Toppings.TOMATO);
		    this.toppingList.add(Toppings.CHEESE);
		}
		

	@Override
	protected double addToppingsToPrice(double priceWithoutToppings) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double updatePizzaPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}

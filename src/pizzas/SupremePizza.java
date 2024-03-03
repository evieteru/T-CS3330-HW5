package pizzas;

import java.util.List;

import Cooking.ICookingStrategy;
import hw5.Toppings;

public class SupremePizza extends AbstractPizza {
	
	
	//Constructor
		public SupremePizza(List<Toppings> toppingList, double priceWithoutToppings,
	            double totalPrice, int pizzaOrderID, ICookingStrategy cookingStrategy, double cookingPrice) {
			super(toppingList, totalPrice, pizzaOrderID, cookingStrategy, cookingPrice);
			
			this.priceWithoutToppings = 3.50;
			
			addDefaultToppings();
		}

		//Copy Constructor
		public SupremePizza(HawaiianPizza other) {
			super(other.getToppingList(), other.getTotalPrice(),
			   other.getPizzaOrderID(), other.getCookingStrategy(), other.getCookingPrice());
			
			this.priceWithoutToppings = 3.50;
			
			addDefaultToppings();
		}
		
		private void addDefaultToppings() {
			// Add default toppings: TOMATO, CHEESE, BELL_PEPPER, ITALIAN_SAUSAGE, PEPPERONI, BLACK_OLIVE, MUSHROOM
		    this.toppingList.add(Toppings.TOMATO);
		    this.toppingList.add(Toppings.CHEESE);
		    this.toppingList.add(Toppings.BELL_PEPPER);
		    this.toppingList.add(Toppings.ITALIAN_SAUSAGE);
		    this.toppingList.add(Toppings.PEPPERONI);
		    this.toppingList.add(Toppings.BLACK_OLIVE);
		    this.toppingList.add(Toppings.MUSHROOM);
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

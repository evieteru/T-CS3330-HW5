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
		totalPrice = priceWithoutToppings;
		
		for(Toppings topping : toppingList) {
			totalPrice = totalPrice + topping.getPrice();
		}
		return totalPrice;
	}
	
	
	@Override
	public double updatePizzaPrice() {
		
		totalPrice = this.addToppingsToPrice(this.getPriceWithoutToppings());
		totalPrice += this.getCookingPrice();
		
		return totalPrice;
	}
	

	@Override
	public String toString() {
		return "MargheritaPizza [toppingList=" + toppingList + ", priceWithoutToppings=" + priceWithoutToppings
				+ ", totalPrice=" + totalPrice + ", pizzaOrderID=" + pizzaOrderID + ", cookingStrategy="
				+ cookingStrategy + ", cookingPrice=" + cookingPrice + "]";
	}



	
	

}

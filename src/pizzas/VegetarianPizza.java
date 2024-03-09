package pizzas;

import java.util.List;
import hw5.CookingStyleType;

//import Cooking.ICookingStrategy;
import hw5.Toppings;

public class VegetarianPizza extends AbstractPizza {
	
	
	//Constructor
		public VegetarianPizza(List<Toppings> toppingList, double priceWithoutToppings,
	            double totalPrice, int pizzaOrderID, CookingStyleType cookingStrategy, double cookingPrice) {
			super(toppingList, totalPrice, pizzaOrderID, cookingStrategy, cookingPrice);
			
			this.priceWithoutToppings = 1.50;
			
			addDefaultToppings();
		}
		
		//Default Constructor
		public VegetarianPizza() {
			super();
			
			this.priceWithoutToppings = 3.0;
			addDefaultToppings();
		}


		//Copy Constructor
		public VegetarianPizza(HawaiianPizza other) {
			super(other.getToppingList(), other.getTotalPrice(),
			   other.getPizzaOrderID(), other.getCookingStrategy(), other.getCookingPrice());
			
			this.priceWithoutToppings = 1.50;
			
			addDefaultToppings();
		}
		
		private void addDefaultToppings() {
			// Add default toppings: TOMATO, CHEESE, BELL_PEPPER, BLACK_OLIVE, MUSHROOM
		    this.toppingList.add(Toppings.TOMATO);
		    this.toppingList.add(Toppings.CHEESE);
		    this.toppingList.add(Toppings.BELL_PEPPER);
		    this.toppingList.add(Toppings.BLACK_OLIVE);
		    this.toppingList.add(Toppings.MUSHROOM);
		    
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
		return "VegetarianPizza [toppingList=" + toppingList + ", priceWithoutToppings=" + priceWithoutToppings
				+ ", totalPrice=" + totalPrice + ", pizzaOrderID=" + pizzaOrderID + ", cookingStrategy="
				+ cookingStrategy + ", cookingPrice=" + cookingPrice + "]";
	}
	
	@Override
	public String toppingToString() {
		return "Vegetarian Pizza [Toppings" + toppingList +  "]";
	}

}

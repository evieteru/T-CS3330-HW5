package pizzas;

import Cooking.ICookingStrategy;
import hw5.Toppings;

import java.util.*;

public class HawaiianPizza extends AbstractPizza {
	

	
	//Parameterized Constructor
	public HawaiianPizza(List<Toppings> toppingList, double priceWithoutToppings,
            double totalPrice, int pizzaOrderID, ICookingStrategy cookingStrategy, double cookingPrice) {
		super(toppingList, totalPrice, pizzaOrderID, cookingStrategy, cookingPrice);
		
		this.priceWithoutToppings = 3.0; //Initialize separately as it is different in every subclass
		
		addDefaultToppings();
		
	}
	
	//Default Constructor
	public HawaiianPizza() {
		super();
		
		this.priceWithoutToppings = 3.0;
		addDefaultToppings();
	}

	//Copy Constructor
	public HawaiianPizza(HawaiianPizza other) {
		super(other.getToppingList(),  other.getTotalPrice(),
		   other.getPizzaOrderID(), other.getCookingStrategy(), other.getCookingPrice());
		
		this.priceWithoutToppings = 3.0;
		
		addDefaultToppings();
		
		
	}
	
	private void addDefaultToppings() {
		// Add default toppings: CANADIAN_BACON, CHEESE, PINEAPPLE
	    this.toppingList.add(Toppings.CANADIAN_BACON);
	    this.toppingList.add(Toppings.CHEESE);
	    this.toppingList.add(Toppings.PINEAPPLE);
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
		return "HawaiianPizza [toppingList=" + toppingList + ", priceWithoutToppings=" + priceWithoutToppings
				+ ", totalPrice=" + totalPrice + ", pizzaOrderID=" + pizzaOrderID + ", cookingStrategy="
				+ cookingStrategy + ", cookingPrice=" + cookingPrice + "]";
	}

	

}

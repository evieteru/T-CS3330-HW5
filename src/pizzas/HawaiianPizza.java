package pizzas;

import Cooking.ICookingStrategy;
import hw5.Toppings;

import java.util.*;

public class HawaiianPizza extends AbstractPizza {
	

	
	//Constructor
	public HawaiianPizza(List<Toppings> toppingList, double priceWithoutToppings,
            double totalPrice, int pizzaOrderID, ICookingStrategy cookingStrategy, double cookingPrice) {
		super(toppingList, totalPrice, pizzaOrderID, cookingStrategy, cookingPrice);
		
		this.priceWithoutToppings = 3.0; //Initialize separately as it is different in every subclass
		
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

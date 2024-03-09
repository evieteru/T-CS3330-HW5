package hw5;

import java.util.ArrayList;
import java.util.List;

import Cooking.*;
import pizzas.AbstractPizza;

public class PizzaOrder {
	
	private PizzaCookingFactory pizzaFactory;
	//private ICookingStrategy cookingStrategy;
	private List<AbstractPizza> pizzaOrderList;
	
	
	public PizzaOrder() {
		this.pizzaOrderList = new ArrayList<>();
		this.pizzaFactory = new PizzaCookingFactory();
		
	}
	
	
	public void printLisitOfToppingsByPizzaOrderID(int orderID) {
		
		AbstractPizza pizza = findPizzaByOrderID(orderID);
		
		
			if(pizza == null) {
				System.out.println("Pizza with order ID " + orderID + " not found.");
				return;
			}
			else {
				System.out.println(pizza.toppingToString());	
			}
	}
		
		
	public void printPizzaOrderCart(int orderID) {
		
		if(pizzaOrderList == null) {
			System.out.println("No pizzas");
		}
		
		for(AbstractPizza pizza : pizzaOrderList) {
			System.out.println(pizza.toppingToString());
		}
	}
	
	
	public AbstractPizza getPizzaByOrderID(int orderID) {
		
		AbstractPizza pizza = findPizzaByOrderID(orderID);
		
		if(pizza == null) {
			System.out.println("Pizza with order ID " + orderID + " not found.");
			return null;
		}
		
		else {
			return pizza;
		}
		
		
	}
	
	
	 public boolean addPizzaToCart(PizzaType pizzaType) {
		 //the .add() method returns a boolean value
		 return pizzaOrderList.add(pizzaFactory.createPizza(pizzaType));
	 }
	 
	 
	 
	 public boolean addNewToppingToPizza(int orderID, Toppings topping) {
		 
		 AbstractPizza pizza = findPizzaByOrderID(orderID);
		 
		 boolean ans = pizza.getToppingList().contains(topping);
		 
		 if(ans) {
			 System.out.println("You already have " + topping + ".");
			 return ans; 
		 }
		 
		 else {
			 pizza.getToppingList().add(topping);
			 pizza.updatePizzaPrice();
			 
			 System.out.println("Added " + topping);
			 System.out.println("New price: " + pizza.getTotalPrice());
			 return ans;
			 
		 } 
	 }
	 
	 
	 public boolean removeToppingFromPizza(int orderID, Toppings topping) {

		 AbstractPizza pizza = findPizzaByOrderID(orderID);
		 
		 boolean ans = pizza.getToppingList().contains(topping);
		 
		 if(ans) {
			 pizza.getToppingList().remove(topping);
			 pizza.updatePizzaPrice();
			 
			 System.out.println("You removed " + topping);
			 System.out.println("New price: " + pizza.getTotalPrice());
			 return ans;
		 }
		 else {
			 System.out.println("You don't have that topping.");
			 return ans;
		 } 
	 }
	 
	 
	 
	 public boolean isThereAnyUncookedPizza() {
		 
		 for (AbstractPizza pizza : pizzaOrderList) {
			 if(pizza.getCookingStrategy() == null) {
				 return true;
			 }
		 }
		 
		 return false; //there are no pizzas without a cooking strategy
	 }
	 
	 
	 
	 public double checkout() throws Exception{
		 
		 if (isThereAnyUncookedPizza()) {
			 throw new Exception("Cannot checkout: There are raw pizzas!");
		 }
		 
		 
		 double orderTotal = 0.0;
		 for(AbstractPizza pizza : pizzaOrderList) {
			 orderTotal += pizza.getTotalPrice();
		 }
		 
		 return orderTotal; 
	 }
	 
	 
	 public boolean selectCookingStrategyByPizzaOrderID(int orderID, CookingStyleType cookingStrategyType) {
		 
		 AbstractPizza pizza = findPizzaByOrderID(orderID);
		 
		 switch (cookingStrategyType) {
		 	case BRICK_OVEN:
		 		BrickOvenCookingStrategy cookingStrategy1 = new BrickOvenCookingStrategy();
		 		cookingStrategy1.cook(pizza);
		 		return true;
		 		
		 	case CONVENTIONAL_OVEN:
		 		ConventionalOvenCookingStrategy cookingStrategy2 = new ConventionalOvenCookingStrategy();
		 		cookingStrategy2.cook(pizza);
		 		return true;
		 		
		 	case MICROWAVE:
		 		MicrowaveOvenCookingStrategy cookingStrategy3 = new MicrowaveOvenCookingStrategy();
		 		cookingStrategy3.cook(pizza);
		 		return true;
		 		
		
		 }
		 	
		 return false;	
			 
	}
		 
		 
		 
		
		
	//Helper functions	
	private AbstractPizza findPizzaByOrderID(int orderID) {
		
		for(AbstractPizza pizza : pizzaOrderList) {
			if(pizza.getPizzaOrderID() == orderID) {
				return pizza;
			}
		}
		
		return null;
	}

	
	
//Getters and Setters
	public List<AbstractPizza> getPizzaOrderList() {
		return pizzaOrderList;
	}
	

	
		
}
	
	



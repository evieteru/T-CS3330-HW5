package pizzas;
import java.util.*;

import Cooking.ICookingStrategy;
import hw5.*;

public abstract class AbstractPizza {
	
	    protected List<Toppings> toppingList;
	    protected double priceWithoutToppings;
	    protected double totalPrice;
	    protected int pizzaOrderID;
	    protected static int orderIDCounter = 0;
	    protected ICookingStrategy cookingStrategy;
	    protected double cookingPrice;
	    
	    
	    
	    public AbstractPizza(List<Toppings> toppingList, double totalPrice,
				int pizzaOrderID, ICookingStrategy cookingStrategy, double cookingPrice) {

	    	this.toppingList = new ArrayList<>(toppingList);
	        this.pizzaOrderID = ++orderIDCounter;
	        
	        
			this.totalPrice = totalPrice;
			this.pizzaOrderID = pizzaOrderID;
			this.cookingStrategy = cookingStrategy;
			this.cookingPrice = cookingPrice;
		}



		//Getters and Setters
	    public List<Toppings> getToppingList() {
			return toppingList;
		}

		public void setToppingList(List<Toppings> toppingList) {
			this.toppingList = toppingList;
		}

		public double getPriceWithoutToppings() {
			return priceWithoutToppings;
		}

//		public void setPriceWithoutToppings(double priceWithoutToppings) {
//			this.priceWithoutToppings = priceWithoutToppings;
//		}

		public double getTotalPrice() {
			return totalPrice;
		}

		public void setTotalPrice(double totalPrice) {
			this.totalPrice = totalPrice;
		}

		public int getPizzaOrderID() {
			return pizzaOrderID;
		}

		public void setPizzaOrderID(int pizzaOrderID) {
			this.pizzaOrderID = pizzaOrderID;
		}

		public static int getOrderIDCounter() {
			return orderIDCounter;
		}

		public static void setOrderIDCounter(int orderIDCounter) {
			AbstractPizza.orderIDCounter = orderIDCounter;
		}

		public ICookingStrategy getCookingStrategy() {
			return cookingStrategy;
		}

		public void setCookingStrategy(ICookingStrategy cookingStrategy) {
			this.cookingStrategy = cookingStrategy;
		}

		public double getCookingPrice() {
			return cookingPrice;
		}

		public void setCookingPrice(double cookingPrice) {
			this.cookingPrice = cookingPrice;
		}
		

	    //Abstract methods that subclasses will implement
	    protected abstract double addToppingsToPrice(double priceWithoutToppings);
	    public abstract double updatePizzaPrice();

	    

	    @Override
	    public abstract String toString();
	    
	    
	    
	    

		
	}



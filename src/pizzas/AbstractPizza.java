package pizzas;
import java.util.*;


//import Cooking.ICookingStrategy;
import hw5.*;

public abstract class AbstractPizza {
	
	    protected List<Toppings> toppingList;
	    protected double priceWithoutToppings;
	    protected double totalPrice;
	    protected int pizzaOrderID;
	    protected static int orderIDCounter = 0;
	    protected CookingStyleType cookingStrategy;
	    protected double cookingPrice;
	    
	    
	    // Parameterized Constructor
	    public AbstractPizza(List<Toppings> toppingList, double totalPrice,
				int pizzaOrderID, CookingStyleType cookingStrategy, double cookingPrice) {

	    	this.toppingList = new ArrayList<>(toppingList);
	        ++orderIDCounter;
	        
	        
			this.totalPrice = totalPrice;
			this.pizzaOrderID = pizzaOrderID;
			this.cookingStrategy = cookingStrategy;
			this.cookingPrice = cookingPrice;
		}
	    
	    //Default Constructor
	    public AbstractPizza() {
	    	this.toppingList = new ArrayList<>();
	        ++orderIDCounter;
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

		public CookingStyleType getCookingStrategy() {
			return cookingStrategy;
		}

		public void setCookingStrategy(CookingStyleType cookingStrategy) {
			this.cookingStrategy = cookingStrategy;
		}

		public double getCookingPrice() {
			return cookingPrice;
		}

		public void setCookingPrice(double cookingPrice) {
			this.cookingPrice = cookingPrice;
		}
		
		
		public String toppingToString() {
			return "HawaiianPizza [Toppings" + toppingList +  "]";
		}

	    //Abstract methods that subclasses will implement
	    protected abstract double addToppingsToPrice(double priceWithoutToppings);
	    public abstract double updatePizzaPrice();

	    

	    @Override
	    public abstract String toString();
	    
	    
	    
	    

		
	}



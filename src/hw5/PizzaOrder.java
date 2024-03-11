package hw5;

public class PizzaOrder {
	private PizzaCookingFactory pizzaFactory;
	private ICookingStrategy cookingStrategy; // This is useless bc not all pizzas are cooked same way in a cart!
	List<AbstractPizza> pizzaOrderList;
	public PizzaOrder() {
		pizzaFactory = new PizzaCookingFactory(); 
		pizzaOrderList = new ArrayList<AbstractPizza>();
	}
	
	/**
	 * Finds the pizza order with the given ID and removes the given topping from its topping list if it exists in the list. If the given topping is removed, it also updates the pizza price and returns true. If the topping doesn’t exist in the topping list of the pizza and cannot be removed, it returns false.
	 * @param orderID
	 * @param topping
	 * @return boolean, false if topping not found in list/pizza not found. True otherwise
	 */
	public void printListOfToppingsByPizzaOrderID(int orderID) {
    		AbstractPizza pizza = getPizzaByOrderID(orderID);
    		if (pizza != null) {
        		System.out.println("Toppings for Pizza Order ID " + orderID + ":");
        		for (Toppings topping : pizza.getToppingList()) {
            			System.out.println(topping.name());
	        	}
    		} else {
        		System.out.println("No pizza found with Order ID: " + orderID);
    		}
	}

	public void printPizzaOrderCart() {
    		System.out.println("Pizza Order Cart Contents:");
    		for (AbstractPizza pizza : pizzaOrderList) { // Check the list if it is toString
        		System.out.println(pizza);
		}
	}

	
	public boolean removeToppingFromPizza(int orderID, Toppings topping) {
		AbstractPizza foundedPizza = getPizzaByOrderID(orderID);
		if(foundedPizza != null) {
			if (foundedPizza.toppingList.contains(topping)) {
				foundedPizza.getToppingList().remove(topping);
				foundedPizza.updatePizzaPrice();
				System.out.println("You removed " + topping);
				System.out.println("New price: " + foundedPizza.getTotalPrice());
				return true;
			}
			System.out.println("Topping not found");
		}
		return false;
	}

	/**
 	* checks the pizzas in the pizzaOrderList and checks their cooking strategies. It returns true if there are any pizzas without any assigned pizza cooking strategy. It returns false if there are no pizzas without an assigned cooking strategy.
 	* @return boolean, false if no pizza in list is raw, else true if a pizza is raw
 	*/
	public boolean isThereAnyUncookedPizza() {
		for (AbstractPizza pizza: pizzaOrderList) {
			if(pizza.getCookingStrategy() == null) {
				return true;
			}
		}
		return false;
	}

	/**
	 * checks if there are any uncooked pizzas. If all pizzas are cooked, it calculates the total price of all pizzas and returns the total cart price. However, if there is at least one uncooked pizza
	 * it throws an exception (Use the general Exception class). The checkout method calls the isThereAnyUncookedPizza method to check for uncooked pizzas and throws an exception.
	 * @return double, total price of pizzas with all fees included
	 * @throws Exception, if pizza is uncooked.
	 */
	public double checkout() throws Exception {
		double checkoutPrice = 0.0;
		if (this.isThereAnyUncookedPizza()) {
			throw new Exception("Can't checkout: A raw pizza in the cart!");
		}
		else {
			for (AbstractPizza pizza: pizzaOrderList) {
				checkoutPrice += pizza.getTotalPrice();
			}
		}
		return checkoutPrice;
	}
	
	/**
 	* Gets the pizza with the given order ID, instantiates the cookingStrategy according to the cookingStrategyType parameter. Calls the cook function for the pizza of the pizza order with the given order ID
 	* @param orderID
 	* @param cookingStrategyType
 	* @return
 	*/
	public boolean selectCookingStrategyByPizzaOrderID(int orderID, CookingStyleType cookingStrategyType) {
		AbstractPizza foundedPizza = getPizzaByOrderID(orderID);
		if(foundedPizza != null) {
			switch(cookingStrategyType) {
				case BRICK_OVEN:
					BrickOvenCookingStrategy strategy1 = new BrickOvenCookingStrategy();
					strategy1.cook(foundedPizza);
					return true;
				case CONVENTIONAL_OVEN:
					ConventionalOvenCookingStrategy strategy2 = new ConventionalOvenCookingStrategy();
					strategy2.cook(foundedPizza);
					return true;
				case MICROWAVE:
					MicrowaveCookingStrategy strategy3 = new MicrowaveCookingStrategy();
					strategy3.cook(foundedPizza);
					return true;
				default:
					
					return false;
			}
		}
		return false;
	}
}

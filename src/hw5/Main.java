package hw5;

public class Main {

	public static void main(String[] args) {
		// Instantiate a pizzaOrder, perform operations based on the requirements.
		PizzaOrder order = new PizzaOrder();
		order.addPizzaToCart(PizzaType.HAWAIIAN);
		
		// Should find & print out info for Hawaiian pizza (with no modifications)
		HawaiianPizza p1 = (HawaiianPizza)order.getPizzaByOrderID(0);
		System.out.println(p1);
		
		// Testing the add toppings function on 1st pizza added (the p1 Hawaiian pizza should also now have mushrooms)
		order.addNewToppingToPizza(0, Toppings.MUSHROOM);
		
		// Ensure that cookingPrice & totalPrice & cookingStrategy is updated accordingly
		order.selectCookingStrategyByPizzaOrderID(0, CookingStyleType.BRICK_OVEN);
		// Add new pizza
		order.addPizzaToCart(PizzaType.SUPREME);
		
		// This should be false bc the mushroom should already be in a supreme pizza
		System.out.println(order.addNewToppingToPizza(1, Toppings.MUSHROOM));
		order.selectCookingStrategyByPizzaOrderID(1, CookingStyleType.MICROWAVE);
		order.printPizzaOrderCart(1);
		order.removeToppingFromPizza(1,Toppings.BELL_PEPPER);
		order.printListOfToppingsByPizzaOrderID(3);
		
		System.out.println(order.isThereAnyUncookedPizza());
		try {
			order.printPizzaOrderCart(1);
			System.out.println(order.checkout());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

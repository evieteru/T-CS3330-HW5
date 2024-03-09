package hw5;

import java.util.List;

import pizzas.AbstractPizza;

public class Main {

	public static void main(String[] args) {
		
		PizzaOrder order = new PizzaOrder();
		List<AbstractPizza> orderList = order.getPizzaOrderList();
		
		
		//Add a Pizza
		order.addPizzaToCart(PizzaType.HAWAIIAN);
		
		AbstractPizza pizza1 = orderList.get(0);
		
		int pizza1ID = pizza1.getPizzaOrderID();
		
		order.printLisitOfToppingsByPizzaOrderID(pizza1ID);
		
		
		//Add/remove toppings
		order.addNewToppingToPizza(pizza1ID, Toppings.CHEESE);
		
		order.addNewToppingToPizza(pizza1ID, Toppings.BELL_PEPPER);
		order.addNewToppingToPizza(pizza1ID, Toppings.BLACK_OLIVE);
		
		order.removeToppingFromPizza(pizza1ID, Toppings.PEPPERONI);
		order.removeToppingFromPizza(pizza1ID, Toppings.BLACK_OLIVE);
		
		
		//Add more Pizzas (supreme, margherita, vegetarian
		order.addPizzaToCart(PizzaType.MARGHERITA);
		AbstractPizza pizza2 = orderList.get(1);
		int pizza2ID = pizza2.getPizzaOrderID();
		order.printLisitOfToppingsByPizzaOrderID(pizza2ID);
		
		order.addPizzaToCart(PizzaType.SUPREME);
		AbstractPizza pizza3 = orderList.get(2);
		int pizza3ID = pizza3.getPizzaOrderID();
		order.printLisitOfToppingsByPizzaOrderID(pizza3ID);
		
		order.addPizzaToCart(PizzaType.VEGETARIAN);
		AbstractPizza pizza4 = orderList.get(3);
		int pizza4ID = pizza4.getPizzaOrderID();
		order.printLisitOfToppingsByPizzaOrderID(pizza4ID);
		
		//Try to print a non-existing order
		order.printLisitOfToppingsByPizzaOrderID(6);
		
		
		
		//See cart
		System.out.println("\nHere is your cart:");
		order.printPizzaOrderCart(pizza1ID);
		
		
		//Try to checkout with raw pizzas
//		try {
//			order.checkout();
//		} catch (Exception e) {
//			e.getMessage();
//			e.printStackTrace();
//		}

		//Setting cooking styles
		order.selectCookingStrategyByPizzaOrderID(pizza1ID, CookingStyleType.BRICK_OVEN);
		System.out.println();
		order.selectCookingStrategyByPizzaOrderID(pizza2ID, CookingStyleType.CONVENTIONAL_OVEN);
		System.out.println();
		order.selectCookingStrategyByPizzaOrderID(pizza3ID, CookingStyleType.MICROWAVE);
		System.out.println();
		order.selectCookingStrategyByPizzaOrderID(pizza4ID, CookingStyleType.MICROWAVE);
		System.out.println();
		
		
		//Try to checkout again
		try {
			double cartTotal = order.checkout();
			System.out.println("You successfully checked out! Your total is: " + cartTotal);
			System.out.println("Thank you for your business! Rate us on Yelp!");
		} 
		catch (Exception e) {
			e.getMessage();
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

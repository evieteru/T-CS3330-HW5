package hw5;

public class Main {

	public static void main(String[] args) {
		// Instantiate a pizzaOrder, perform operations based on the requirements.
		PizzaOrder order = new PizzaOrder();
		order.addPizzaToCart(PizzaType.HAWAIIAN);
		HawaiianPizza p1 = (HawaiianPizza)order.getPizzaByOrderID(0);
		System.out.println(p1);
		order.addNewToppingToPizza(0, Toppings.MUSHROOM);
		order.selectCookingStrategyByPizzaOrderID(0, CookingStyleType.BRICK_OVEN);
		
		order.addPizzaToCart(PizzaType.SUPREME);
		SupremePizza p2 = (SupremePizza)order.getPizzaByOrderID(1);
		System.out.println(p2);
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

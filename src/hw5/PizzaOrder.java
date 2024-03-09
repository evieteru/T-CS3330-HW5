package hw5;

public class PizzaOrder {
	private PizzaCookingFactory pizzaFactory;
	private ICookingStrategy cookingStrategy; // This is useless bc not all pizzas are cooked same way in a cart!
	List<AbstractPizza> pizzaOrderList;
	public PizzaOrder() {
		pizzaFactory = new PizzaCookingFactory(); 
		pizzaOrderList = new ArrayList<AbstractPizza>();
	}
}

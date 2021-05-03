package Exercise4_3;

public class Apple  extends Fruit { //sub class for Fruit
	
	protected double price;
	protected int quantity;
	
	public Apple(String name, double price, int quantity) { //constructor with 3 arguments
		super(name);
		this.price = price;
		this.quantity = quantity;
	}
	
	public String totalPrice() { //overloading method with no argument
		return "This Apple is RM" + this.price + "per kg.";
	}
	
	public String totalPrice(double price) { //overloading method with 1 argument
		if (price >= 0)
			return "Price is expensive.";
		else
			return "Price is cheap.";
	}
	
	public double totalPrice(double price, int quantity) { //overloading method with 2 arguments
		return this.price*this.quantity;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	public String toString() { //overriding method
		return super.toString() + "\nPrice\t\t:RM" + price + "\nQuantity\t:" + quantity;
	}
} //end class for Apple

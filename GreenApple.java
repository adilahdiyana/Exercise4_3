package Exercise4_3;

public class GreenApple extends Apple { //sub class for Apple
	
	protected double weight;
	protected String brand;
	
	public GreenApple(String name, double price, int quantity, double weight, String brand) { //constructor sub class with arguments
		super(name, price, quantity); //inherit data from superclass with passing parameter
		this.weight = weight;
		this.brand = brand;
	}
	
	public String totalPrice() { //overriding method from class Apple with no argument
		return "The price is RM" + this.price + "per kg.";
	}
	
	public String totalWeight() { //overloading method with no argument
		return "This weight of green apple is:" + this.weight + "kg.";
	}
	
	public String totalWeight(double weight) { //overloading method with 1 argument
		if (weight <= 0)
			return "This weight is uncountable.";
		else
			return "This weight is accepted.";
	}
	
	public double gettotalWeight() { 
			return super.getQuantity()*this.weight;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public String getBrand() {
		return this.brand;
	}
	
	public String toString() { //overriding method
		return super.toString() + "\nWeight\t\t:" + weight + "kg" + "\nBrand\t\t:" + brand;
	}
} //end for class GreenApple

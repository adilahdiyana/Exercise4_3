package Exercise4_3;

public class RedApple extends Apple { //sub class for Apple
	
	protected double vitc;
	protected double sugar;
	
	public RedApple(String name, double price, int quantity, double vitc, double sugar) {
		super(name, price, quantity);
		this.vitc = vitc;
		this.sugar = sugar;
	}
	
	public String totalPrice() { //overriding method in Apple class
		return "The price is RM" + this.price + "per kg.";
	}
	
	public String totalSugar() { //overloading with no argument
		return "The sugar of red apple is:" + this.sugar;
	}
	
	public String totalSugar(double sugar) { //overloading with 1 argument
		if (sugar == 0)
			return "The sugar of red apple contains many benefits to people to stay healthy.";
		else
			return "This red apple doesnt contains any benefits to people.";
	}		
	
	public double getVitc() {
		return this.vitc;
	}
	
	public double getSugar() {
		return this.sugar;
	}
	
	public String toString() { //overriding method
		return super.toString() + "\nVitamin c\t:" + vitc + "\nSugar\t\t:" + sugar;
	}
} //end class for RedApple

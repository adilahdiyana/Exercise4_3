package Exercise4_3;

public class Strawberry extends Fruit { //sub class for Fruit
	
	protected int quantity;
	protected double mass;
	
	public Strawberry(String name, int quantity, double mass) {
		super(name);
		this.quantity = quantity;
		this.mass = mass;
	}
	
	public String totalMass() { //overloading method with no argument
		return "The mass of strawberry is:" + this.mass + "kg.";
	}
	
	public String totalMass(double mass) { //overloading method with 1 argument
		if (mass >= 0)
			return "Mass is overweight.";
		else
			return "Mass is accepted.";
	}
	
	public double totalMass(double mass, int quantity) { //overloading method with 2 arguments
		return this.quantity*this.mass;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	public double getMass() {
		return this.mass;
	}
	
	public String toString() {
		return super.toString() + "\nQuantity\t:" + quantity + "\nMass\t\t:" + mass + "kg.";
	}
} //end for Strawberry class

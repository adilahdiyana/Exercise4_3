package Exercise4_3;

public class Fruit { //super class
	
	protected String name;
	
	public Fruit() { //constructor without argument
		name = " ";	
	}
	
	public Fruit(String n) { //constructor with 1 argument
		name = n;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return name + "constructor is invoked" + "\nFruit is\t\t: " + getName();
	}

}

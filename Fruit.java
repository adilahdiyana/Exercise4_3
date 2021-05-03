package Exercise4_3;

public class Fruit { //super class
	
	protected String name;
	
	public Fruit() { //constructor without argument
		name = " ";	
	}
	
	public Fruit(String name) { //constructor with 1 argument
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return name + " constructor is invoked." + "\nFruit is\t:" + getName();
	}

}

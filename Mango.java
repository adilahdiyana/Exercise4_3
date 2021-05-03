package Exercise4_3;

public class Mango extends Fruit { //sub class for Fruit
	
	protected String size;
	protected String taste;
	
	public Mango(String name, String size, String taste) {
		super(name);
		this.size = size;
		this.taste= taste;
	}
	
	public String totalSize() { //overloading method with no argument
		return "The size of Mango is:" + this.size;
	}
	
	public String totalSize(String size, String taste) { //overloading method with 2 arguments
		if (size == " ")
			return "The taste of mango is sour.";
		else
			return "The taste of mango is sweet.";
	}
	
	public String getSize() {
		return this.size;
	}
	
	public String getTaste() {
		return this.taste;
	}
	
	public String toString() {
		return super.toString() + "\nSize\t\t:" + this.size + "\nTaste\t\t:" + this.taste;
	}
} //end for class Mango

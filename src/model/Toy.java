package model;

public class Toy extends Product {
	protected int type;

	public Toy() {
		super();
	}

	public Toy(int id, String name, double price) {
		super(id, name, price);
	}

	public Toy(int id, String name, double price, int type) {
		super(id, name, price);
		this.type = type;
	}

	public Toy(int type) {
		super();
		this.type = type;
	}

	private String typeName(int type) {
		if (type == 1) {
			return "Small";
		} else if (type == 2) {
			return "Medium";
		} else {
			return "Big";
		}
	}

	public void display() {
		System.out.println("Id: " + id);
		System.out.println("Name: " + name);
		System.out.println("Price: " + price);
		System.out.println("Type: " + typeName(type));
		System.out.println();
	}

}

package model;

public class Customer extends User {

	public Customer() {
		super();
	}

	public Customer(int id, String name, int age, int phone, String address, String username, String password,
			String position) {
		super(id, name, age, phone, address, username, password, position);
	}

	@Override
	public void display() {
		super.display();
	}

}

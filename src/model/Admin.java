package model;

public class Admin extends User {
	public Admin() {
		super();
	}

	public Admin(int id, String name, int age, int phone, String address, String username, String password,
			String position) {
		super(id, name, age, phone, address, username, password, position);
	}

	@Override
	public void display() {
		super.display();
	}

}

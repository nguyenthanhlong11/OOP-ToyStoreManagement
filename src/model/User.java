package model;

public class User extends Person {
	protected String username;
	protected String password;
	protected String position;

	public User() {
		super();
	}

	public User(int id, String name, int age, String address, int phone) {
		super(id, name, age, address, phone);
	}

	public User(int id, String name, int age, int phone, String address, String username, String password,
			String position) {
		super(id, name, age, address, phone);
		this.username = username;
		this.password = password;
		this.position = position;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public void display() {
		System.out.println("Id: " + id);
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Address: " + address);
		System.out.println("Phone number: " + phone);
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);
		System.out.println("Position: " + position);
		System.out.println();
	}

}

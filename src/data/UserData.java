package data;

import java.util.ArrayList;
import model.User;
import model.Admin;
import model.Customer;

public class UserData {

	public static ArrayList<User> userList = new ArrayList<User>();
	public static ArrayList<Admin> adminList = new ArrayList<Admin>();
	public static ArrayList<Customer> customerList = new ArrayList<Customer>();

	public static void customerAccountData() {
		Customer c1 = new Customer(3, "Ho Thi Yeu", 19, 84987654, "Quang Tri", "Yeu", "1234", "customer");
		Customer c2 = new Customer(4, "Ho Thi Mai", 20, 84987654, "Quang Tri", "Mai", "12345", "customer");
		customerList.add(c1);
		customerList.add(c2);
	}

	public static void adminAccountData() {
		Admin a1 = new Admin(1, "Ho Thi Chau", 19, 84987654, "Quang Tri", "ChauHo", "1234", "admin");
		Admin a2 = new Admin(2, "Nguyen Thanh Long", 19, 0357764225, "Quang Nam", "longnguyen", "12345", "admin");
		adminList.add(a1);
		adminList.add(a2);
	}

	public static void userAccountData() {
		User u1 = new User(1, "Ho Thi Chau", 19, 84987654, "Quang Tri", "ChauHo", "1234", "admin");
		User u2 = new User(2, "Nguyen Thanh Long", 19, 0357764225, "Quang Nam", "longnguyen", "12345", "admin");
		User u3 = new User(3, "Ho Thi Yeu", 19, 84987654, "Quang Tri", "Yeu", "1234", "customer");
		User u4 = new User(4, "Tran Cong Dung", 20, 84987654, "Quang Nam", "dungtran", "12345", "customer");
		userList.add(u1);
		userList.add(u2);
		userList.add(u3);
		userList.add(u4);
	}
}

package manager;

import data.UserData;
import model.User;

public class RegisterManager {
	
	public void checkRegisterInformation(int id, int age, String name, String address, int phone, String username,
			String password, String position) {
		User user = new User(id, name, age, phone, address, position, username, password);
		UserData.userList.add(user);
		System.out.println("\n\t\t\t\t\tRegister success!");
	}
}

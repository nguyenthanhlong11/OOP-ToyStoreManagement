package manager;

import data.UserData;
import view.AdminView;
import view.CustomerView;
import view.LoginView;

public class LoginManager {
	LoginView loginView = new LoginView();

	public void checkLoginInformation(String userName, String passWord) {
		int count = 0;
		for (int i = 0; i < UserData.userList.size(); i++) {
			if (UserData.userList.get(i).getUsername().compareTo(userName) == 0
					&& UserData.userList.get(i).getPassword().compareTo(passWord) == 0
					&& UserData.userList.get(i).getPosition().compareTo("admin") == 0) {
				System.out.println("\t\t\t\t\tLogged in successfully ");
				new AdminView().functionOfAdmin();
				count++;
			} else if (UserData.userList.get(i).getUsername().compareTo(userName) == 0
					&& UserData.userList.get(i).getPassword().compareTo(passWord) == 0) {
				System.out.println("\t\t\t\t\tLogged in successfully ");
				count++;
				new CustomerView().functionOfCustomer();
			}
		}
		loginView.checkLogin(count);
	}
}

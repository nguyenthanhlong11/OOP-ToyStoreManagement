package manager;

import model.User;
import data.UserData;

public class UserManager {

	public void displayCustomersInformation() {
		UserData.customerAccountData();
		for (int i = 0; i < UserData.customerList.size(); i++) {
			UserData.customerList.get(i).display();
		}
	}

	public void displayAdminsInformation() {
		UserData.adminAccountData();
		for (int i = 0; i < UserData.adminList.size(); i++) {
			UserData.adminList.get(i).display();
		}
	}

	public void addUserAccount(int id, String name, int age, int phone, String address, String username,
			String password, String position) {
		User user = new User(id, name, age, phone, address, username, password, position);
		UserData.userList.add(user);
		informationOfUsersAfterAdd();
	}

	public void informationOfUsersAfterAdd() {
		System.out.println("Add successfully");
		System.out.println("List after add");
		for (int i = 0; i < UserData.userList.size(); i++) {
			System.out.println();
			UserData.userList.get(i).display();
		}
	}

	public void deleteUsersById(int id) {
		for (int i = 0; i < UserData.userList.size(); i++) {
			if (id == UserData.userList.get(i).getId()) {
				UserData.userList.remove(i);
			}
		}
		System.out.println("Delete successfully");
		informationOfUsersAfterDelete();
	}

	public void informationOfUsersAfterDelete() {
		System.out.println("Add successfully");
		System.out.println("List after delete");
		for (int i = 0; i < UserData.userList.size(); i++) {
			UserData.userList.get(i).display();
		}
	}

	public void displayUsersInformation() {
		for (int i = 0; i < UserData.userList.size(); i++) {
			UserData.userList.get(i).display();
		}
	}

}

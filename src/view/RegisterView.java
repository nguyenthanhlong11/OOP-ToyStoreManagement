package view;

import java.util.Scanner;

import manager.RegisterManager;

public class RegisterView {
	Scanner input = new Scanner(System.in);
	RegisterManager registerManager = new RegisterManager();
	CustomerView customerView = new CustomerView();

	public void inputInformationToRegister() {
		int id, phone, age;
		String confirm;
		String name, address, username, password;
		String position = "Customer";
		System.out.print("                  \nEnter your id:");
		id = input.nextInt();
		System.out.print("                  \nEnter your name:");
		name = input.nextLine();
		name = input.nextLine();
		System.out.print("                  \nEnter you age:");
		age = input.nextInt();
		System.out.print("                  \nEnter you phone:");
		phone = input.nextInt();
		System.out.print("                  \nEnter your address:");
		address = input.nextLine();
		address = input.nextLine();
		System.out.print("                  \nEnter your username:");
		username = input.nextLine();
		System.out.print("                  \nEnter your password:");
		password = input.nextLine();
		do {
			System.out.print("              \nConfirm your password :");
			confirm = input.next();
		} while (password.compareTo(confirm) != 0);

		registerManager.checkRegisterInformation(id, age, name, address, phone, username, password, position);
		customerView.functionOfCustomer();

	}
}

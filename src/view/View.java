package view;

import java.util.Scanner;
import manager.RegisterManager;
import manager.UserManager;

public class View {

	UserManager userManager = new UserManager();
	RegisterManager register = new RegisterManager();
//	LoginView loginView = new LoginView();
	RegisterView registerView = new RegisterView();

	Scanner input = new Scanner(System.in);

	public int choose() {
		System.out.print("\nEnter your choose: ");
		int n = input.nextInt();
		return n;
	}

	public void interfaceOfStore() {
		System.out.println("\t\t\t____________________________________________________________");
		System.out.println("\t\t\t|                                                          |");
		System.out.println("\t\t\t|============= WELCOME TO DORAEMON TOY STORE ==============|");
		System.out.println("\t\t\t|                                                          |");
		System.out.println("\t\t\t|                         1. Login                         |");
		System.out.println("\t\t\t|                         2. Register                      |");
		System.out.println("\t\t\t|                         3. Exit                          |");
		System.out.println("\t\t\t|                                                          |");
		System.out.println("\t\t\t|__________________________________________________________|");
		choose2();
	}

	public void choose2() {
		int choose = choose();
		switch (choose) {
		case 1: {
			new LoginView().loginFeature();
			break;
		}
		case 2: {
			registerView.inputInformationToRegister();
			break;
		}
		case 3:
			exit();
			break;
		default: {
			System.out.println("Please choose again!");
			choose();
			break;
		}
		}
	}

	public void logout() {
		interfaceOfStore();
	}

	public void exit() {
		System.exit(0);
	}
}

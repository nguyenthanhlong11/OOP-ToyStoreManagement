package view;

import java.util.Scanner;
import manager.LoginManager;

public class LoginView {
	Scanner input = new Scanner(System.in);
	View view = new View();
	RegisterView registerView = new RegisterView();

	public void checkLogin(int count) {
		if (count == 0) {
			System.out.println("\t\t\t\t\tUser or Password incorrect!");
			System.out.println("\t\t\t\t\tHave you had an account?!");
			System.out.println("\t\t\t1. Yes          2. No        3. Exit ");
			int choose = view.choose();
			switch (choose) {
			case 1: {
				System.out.println("\t\t\t\t\tLogin again!");
				loginFeature();
				break;
			}
			case 2: {
				System.out.println("\t\t\t\tYou must register!");
				registerView.inputInformationToRegister();
				break;
			}
			case 3: {
				System.out.println("\t\t\t\tEnd");
				System.exit(0);
				break;
			}
			default: {
				System.out.println("\t\t\t\tChoose again");
				view.choose();
				break;
			}
			}
		}
	}

	public void loginFeature() {
		String userName;
		String passWord;
		System.out.println("\t\t\t=========================  Login  =========================");
		System.out.print("\n\t\t\t\tEnter Username : ");
		userName = input.nextLine();
		System.out.print("\n\t\t\t\tEnter Password :  ");
		passWord = input.nextLine();
		LoginManager loginmanager = new LoginManager();
		loginmanager.checkLoginInformation(userName, passWord);
	}
}

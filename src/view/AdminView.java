package view;

import java.util.Scanner;

import manager.ProductManager;
import manager.UserManager;

public class AdminView {
	Scanner input = new Scanner(System.in);
	UserManager userManager = new UserManager();
	ProductManager productManager = new ProductManager();

	public void backToAdminPage() {
		System.out.print("\nEnter number 1 back to homepage admin:    ");
		input.nextInt();
		functionOfAdmin();
	}

	public void functionOfAdmin() {
		View view = new View();
		System.out.println("\t\t\t____________________________________________________________");
		System.out.println("\t\t\t|                                                          |");
		System.out.println("\t\t\t|==================== FUNCTION OF ADMIN ===================|");
		System.out.println("\t\t\t|                                                          |");
		System.out.println("\t\t\t|                    1. View admin's information           |");
		System.out.println("\t\t\t|                    2. View customer's information        |");
		System.out.println("\t\t\t|                    3. View all user's information        |");
		System.out.println("\t\t\t|                    4. Add user's information             |");
		System.out.println("\t\t\t|                    5. Add product's information          |");
		System.out.println("\t\t\t|                    6. Delete user's information          |");
		System.out.println("\t\t\t|                    7. Delete product's information       |");
		System.out.println("\t\t\t|                    8. View all product information       |");
		System.out.println("\t\t\t|                    9. Log out                            |");
		System.out.println("\t\t\t|                    10. Exit                              |");
		System.out.println("\t\t\t|                                                          |");
		System.out.println("\t\t\t|__________________________________________________________|");
		int n = view.choose();
		switch (n) {
		case 1: {
			userManager.displayAdminsInformation();
			backToAdminPage();
			break;
		}
		case 2: {
			userManager.displayCustomersInformation();
			backToAdminPage();
			break;
		}
		case 3: {
			userManager.displayUsersInformation();
			backToAdminPage();
			break;
		}
		case 4: {
			addUserInformation();
			backToAdminPage();
			break;
		}
		case 5: {
			addProductInformation();
			backToAdminPage();
			break;
		}
		case 6: {
			inputUserIdToDelete();
			backToAdminPage();
			break;
		}
		case 7: {
			inputProductIdToDelete();
			backToAdminPage();
			break;
		}
		case 8: {
			productManager.displayProductsInformation();
			backToAdminPage();
			break;
		}
		case 9: {
			new View().logout();
			break;
		}
		case 10: {
			view.exit();
			break;
		}
		default: {
			System.out.println("Please choose again!");
			view.choose();
			break;
		}
		}
	}

	public void addUserInformation() {
		int id, phone, age;
		String name, address, username, password, position;
		System.out.print("                  \nEnter your id:");
		id = input.nextInt();
		System.out.print("                  \nEnter your name:");
		name = input.nextLine();
		name = input.nextLine();
		System.out.print("                  \nEnter your age:");
		age = input.nextInt();
		System.out.print("                  \nEnter your phone:");
		phone = input.nextInt();
		System.out.print("                  \nEnter your address:");
		address = input.nextLine();
		address = input.nextLine();
		System.out.print("                  \nEnter your username:");
		username = input.nextLine();
		System.out.print("                  \nEnter your password:");
		password = input.nextLine();
		System.out.print("                  \nEnter your position:");
		position = input.nextLine();
		userManager.addUserAccount(id, name, age, phone, address, username, password, position);
	}

	public void addProductInformation() {
		int id, type;
		double price;
		String name;
		System.out.print("                  \nEnter product id:");
		id = input.nextInt();
		System.out.print("                  \nEnter product name:");
		name = input.nextLine();
		name = input.nextLine();
		System.out.print("                  \nEnter product price:");
		price = input.nextDouble();
		System.out.print("                  \nEnter product type:");
		type = input.nextInt();
		productManager.addProduct(id, name, price, type);
	}

	public void inputUserIdToDelete() {
		userManager.displayUsersInformation();
		System.out.print("\nEnter id you want to delete: ");
		int id = input.nextInt();
		userManager.deleteUsersById(id);
	}

	public void inputProductIdToDelete() {
		productManager.displayProductsInformation();
		System.out.print("\nEnter id you want to delete: ");
		int id = input.nextInt();
		productManager.deleteProductById(id);
	}

}

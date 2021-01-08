package view;

import java.util.Scanner;

import manager.ProductManager;

public class CustomerView {
	Scanner input = new Scanner(System.in);

	public void functionOfCustomer() {
		View view = new View();
		ProductManager productManager = new ProductManager();

		System.out.println("\t\t\t____________________________________________________________");
		System.out.println("\t\t\t|                                                          |");
		System.out.println("\t\t\t|==================== FUNCTION OF CUSTOMER ================|");
		System.out.println("\t\t\t|                                                          |");
		System.out.println("\t\t\t|                    1. View's product information         |");
		System.out.println("\t\t\t|                    2. Log out                            |");
		System.out.println("\t\t\t|                    3. Exit                               |");
		System.out.println("\t\t\t|                                                          |");
		System.out.println("\t\t\t|__________________________________________________________|");
		int n = new View().choose();
		switch (n) {
		case 1: {
			productManager.displayProductsInformation();
			break;
		}
		case 2: {
			view.interfaceOfStore();
			break;
		}
		case 3: {
			view.exit();
			break;
		}
		}
	}

	public void backToCustomerPage() {
		System.out.print("\nEnter number 1 back to homepage customer:   ");
		input.nextInt();
		functionOfCustomer();
	}
}

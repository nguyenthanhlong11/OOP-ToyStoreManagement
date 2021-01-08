package main;

import data.ProductData;
import data.UserData;
import view.View;

public class Main {

	public static void main(String[] args) {
		UserData.userAccountData();
		ProductData.productData();

		View view = new View();
		view.interfaceOfStore();
	}
}

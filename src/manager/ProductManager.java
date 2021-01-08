package manager;

import data.ProductData;
import model.Toy;

public class ProductManager {

	public void displayProductsInformation() {
		for (int i = 0; i < ProductData.toyList.size(); i++) {
			ProductData.toyList.get(i).display();
		}
	}

	public void addProduct(int id, String name, double price, int type) {
		Toy toy = new Toy(id, name, price, type);
		ProductData.toyList.add(toy);
		System.out.println("Add successfully");
		informationOfProductAfterAdd();
	}

	public void informationOfProductAfterAdd() {
		System.out.println("List after add");
		for (int i = 0; i < ProductData.toyList.size(); i++) {
			System.out.println();
			ProductData.toyList.get(i).display();
		}
	}

	public void deleteProductById(int id) {
		for (int i = 0; i < ProductData.toyList.size(); i++) {
			if (id == ProductData.toyList.get(i).getId()) {
				ProductData.toyList.remove(i);
			}
		}
		System.out.println("Delete successfully");
		informationOfProductAfterDelete();
	}

	public void informationOfProductAfterDelete() {
		System.out.println("List after delete");
		System.out.println();
		for (int i = 0; i < ProductData.toyList.size(); i++) {
			ProductData.toyList.get(i).display();
		}
	}

}

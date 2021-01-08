package data;

import java.util.ArrayList;
import model.Toy;

public class ProductData {

	public static ArrayList<Toy> toyList = new ArrayList<Toy>();

	public static void productData() {
		Toy t1 = new Toy(1, "Bup be baby", 30.000, 1);
		Toy t2 = new Toy(2, "Bup be baby", 50.000, 2);
		Toy t3 = new Toy(3, "Bup be baby", 100.000, 3);
		Toy t4 = new Toy(4, "Sieu nhan", 230.000, 2);
		Toy t5 = new Toy(5, "Sieu nhan", 300.000, 3);
		toyList.add(t1);
		toyList.add(t2);
		toyList.add(t3);
		toyList.add(t4);
		toyList.add(t5);
	}
}

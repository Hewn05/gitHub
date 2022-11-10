package collectionFramework2Prac;

import java.io.IOException;
import java.util.HashMap;

class Food1 {
	private String foodName;

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	Food1(String name) {
		foodName = name;
	}

	public String toString() {
		return foodName;
	}
}

public class HashMapMachRun {

	public static void main(String[] args) throws IOException {
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(3, "HI");
		hm.put(4, "HI");
		hm.put(3, "hi");
		System.out.println(hm.size());
		System.out.println(hm);

		HashMap<Food1, String> hm1 = new HashMap<>();
		Food1 f1 = new Food1("떡볶이");
		Food1 f2 = new Food1("떡볶이");
		hm1.put(f1, "양식");
		hm1.put(f2, "중식");
		System.out.println(f1.equals(f2));
		System.out.println("f1.hashCode : " + f1.hashCode());
		System.out.println("f2.hashCode : " + f2.hashCode());
		System.out.println(hm1.size());
		System.out.println(hm1);

		HashMap<Food2, String> hm2 = new HashMap<>();
		Food2 f3 = new Food2("떡볶이");
		Food2 f4 = new Food2("떡볶이");
		hm2.put(f3, "양식");
		hm2.put(f4, "중식");
		System.out.println(f3.equals(f4));
		System.out.println("f1.hashCode : " + f3.hashCode());
		System.out.println("f2.hashCode : " + f4.hashCode());
		System.out.println(hm2.size());
		System.out.println(hm2);
		
		Runtime.getRuntime().exec("cls");
	}

}

class Food2 {
	private String foodName;

	Food2(String name) {
		foodName = name;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public String toString() {
		return foodName;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Food2) {
			return foodName.equals(((Food2) obj).getFoodName());
		} else {
			return false;
		}
	}

	public int hashCode() {
		return foodName.hashCode();
	}
	
}

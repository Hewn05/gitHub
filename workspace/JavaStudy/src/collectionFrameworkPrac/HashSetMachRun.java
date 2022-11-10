package collectionFrameworkPrac;

import java.util.HashSet;

public class HashSetMachRun {

	public static void main(String[] args) {
		HashSet<Food> hs = new HashSet<>();

		Food f1 = new Food("떡볶이", "분식");
		Food f2 = new Food("떡볶이", "분식");
		Food f3 = new Food("떡볶이", "분식");
		Food f4 = new Food("떡볶이", "분식");

		hs.add(f1);
		hs.add(f2);
		hs.add(f3);
		hs.add(f4);

		System.out.println(f1.equals(f2));
		System.out.println(f1.hashCode());
		System.out.println(f2.hashCode());
		System.out.println(hs.size());
	}
}

class Food {
	String foodName;
	String foodKind;

	public Food(String name, String kind) {
		foodName = name;
		foodKind = kind;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Food) {
			Food temp = (Food) obj;
			return foodName.equals(((Food) temp).foodName) && foodKind.equals(((Food) temp).foodKind);
		} else {
			return false;
		}
	}

	public int hashCode() {
//		System.out.println(foodName.hashCode());
//		System.out.println(foodKind.hashCode());		
		return (foodName + foodKind).hashCode();
	}
}
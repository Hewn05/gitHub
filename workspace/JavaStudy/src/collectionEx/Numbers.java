package collectionEx;

import java.util.*;

public class Numbers {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>(
				Arrays.asList(1,2,3,4,5,1,1,3,3,6,7,8,4,2,10));
		
		TreeSet<Integer> num = new TreeSet<>(numbers);
		
		System.out.println(num);

	}

}

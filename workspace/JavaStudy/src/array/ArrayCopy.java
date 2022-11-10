package array;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4 };
		int[] b = a;

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			System.out.println(b[i]);
		}

		int[] scores = { 1, 2, 3, 4, 5 };
		int[] newScores = scores;
		int[] newScores2 = scores.clone();

		System.out.println(scores);
		System.out.println(newScores);
		System.out.println(newScores2);
		System.out.println(Arrays.toString(scores));
		System.out.println(Arrays.toString(newScores));
		System.out.println(Arrays.toString(newScores2));

		scores[1] = 11;

		System.out.println(Arrays.toString(scores));
		System.out.println(Arrays.toString(newScores));
		System.out.println(Arrays.toString(newScores2));

		int[] cars = { 1, 2, 3, 4, 5, 6, 7 };
		int[] newCars = Arrays.copyOf(cars, cars.length);

		System.out.println(Arrays.toString(cars));
		System.out.println(Arrays.toString(newCars));

		int[] newCars2 = Arrays.copyOf(cars, 3);
		System.out.println(Arrays.toString(newCars2));

		int[] newCars3 = Arrays.copyOf(cars, 10);
		System.out.println(Arrays.toString(newCars3));

		System.out.println(newCars3);
		newCars3 = Arrays.copyOf(newCars3, newCars3.length);
		System.out.println(newCars3);

		int[] newCars4 = Arrays.copyOfRange(cars, 1, 3);
		System.out.println(Arrays.toString(newCars4));

		int[] stars = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int[] newStars = new int[8];
		System.arraycopy(stars, 0, newStars, 0, stars.length);
		System.out.println(Arrays.toString(newStars));

		int[] newStars2 = new int[3];
		System.arraycopy(newStars, 4, newStars2, 0, 3);
		System.out.println(Arrays.toString(newStars2));

		int[] inds = { 1, 2, 3, 4, 5 };
		int[] newInds = new int[5];

		for (int i = 0; i < inds.length; i++) {
			newInds[i] = inds[i];
		}

		System.out.println(Arrays.toString(newInds));
		System.out.println(inds);
		System.out.println(newInds);

		Book[] bArr1 = new Book[3];
		Book[] bArr2 = new Book[3];

		bArr1[0] = new Book("우리1", "당신");
		bArr1[1] = new Book("우리2", "당신");
		bArr1[2] = new Book("우리3", "당신");

		for (int i = 0; i < bArr1.length; i++) {
			bArr2[i] = bArr1[i].clone();
		}

		System.out.println(bArr1);
		System.out.println(bArr2);

		bArr1[0].setBookName("적");
		bArr1[0].setAuthor("놈");
		
		for (int i = 0; i < bArr1.length; i++) {
			bArr1[i].printBookInfo();
		}
		for (int i = 0; i < bArr2.length; i++) {
			bArr2[i].printBookInfo();
		}

		System.out.println(Arrays.toString(bArr1));
		System.out.println(Arrays.toString(bArr2));

	}

}

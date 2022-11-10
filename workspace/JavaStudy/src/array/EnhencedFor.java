package array;

public class EnhencedFor {

	public static void main(String[] args) {

		String[] family = { "아버지", "어머니", "나", "동생", "누나" };
		
		for(int i = 0; i< family.length;i++) {
			System.out.println(family[i]);
		}
		
		for(String el : family) {
			System.out.println(el);
		}
		
		
		
	}
}

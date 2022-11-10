package collectionFramework2Prac;

import java.util.Stack;

public class StackRun {
	
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("첫번째");
		stack.push("두번째");
		stack.push("세번째");
		stack.push("네번째");
		stack.push("다섯번째");
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack);
		System.out.println(stack.size());
		System.out.println(stack.search("세번째"));
		System.out.println(stack.search("다섯번째"));
		stack.push("여섯번째");
		System.out.println(stack.search("다섯번째"));
		System.out.println(stack.search("일곱번째"));
		
//		while(!stack.isEmpty()) {
//			System.out.print(stack.pop()+" ");
//		}
		int size = stack.size();
		for(int i = 0; i < size;i++) {
			System.out.print(stack.pop());
		}
		System.out.println();
		
		
	}

}

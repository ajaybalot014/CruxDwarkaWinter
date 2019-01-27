package Lecture12;

public class StackUsingArraysClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		StackUsingArrays stack = new StackUsingArrays(5);
		for (int i = 1; i <= 5; i++) {
			stack.push(i * 10);
			displayStackInfo(stack);
		}
		// stack.push(60);
		while (!stack.isEmpty()) {
			displayStackInfo(stack);
			stack.pop();
		}

		// stack.pop();
	}

	public static void displayStackInfo(StackUsingArrays stack) throws Exception {
		System.out.println("***************************");
		stack.display();
		System.out.println("Size " + stack.size());
		System.out.println("Top " + stack.top());
		System.out.println("***************************");
	}

}

package co4;
import java.util.*;
public class Q12 {
	
	public static void main(String[] args) {
		// Creating an empty Stack
		Stack<String> stack = new Stack<String>();
				// Use add() method to add elements in the Stack
				stack.add("Ammu");
				stack.add("Malu");
				stack.add("Ligi");
				stack.add("Priya");
				stack.add("Anu");

				// Output the Stack
				System.out.println("Stack: " + stack);

				// Remove the element using remove()
				String rem = stack.remove(1);

				// Print the removed element
				System.out.println("Removed element: "+ rem);

				// Print the final Stack
				System.out.println("Final Stack: "+ stack);

	}

}

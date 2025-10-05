import java.util.ArrayDeque;
import java.util.Deque;

public class GFG {

	// Driver Code
	public static void main(String[] args)
	{

		// Creating an ArrayDeque to use
		// as a Stack
		Deque<Integer> s = new ArrayDeque<Integer>();

		// Inserting elements in the Stack
		// using push() operation
		s.push(17);
		s.push(19);
		s.push(15);

		// Printing the elements
		System.out.println("Stack after insertion: " + s);

		// Removing elements from the Stack
		// using pop() operation
		s.pop();
		System.out.println("Stack after deletion: " + s);
		s.pop();
		System.out.println("Stack after deletion: "	+ s);
	}
}

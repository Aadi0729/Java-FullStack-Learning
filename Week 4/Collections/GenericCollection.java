package collections;
import java.util.*;

public class GenericCollection {
	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>();
		
		// ll.add(10); // error
		ll.add("apple");
		ll.add("orange");
		ll.add("mango");
		
		System.out.println(ll); // [apple, orange, mango]
		for(String fruit : ll)
				System.out.println(fruit);
	}
}

package collections;
import java.util.*;

public class LinkedHashSet {
	public static void main(String[] args) {
		// LinkedHashSet - ordered
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("monitor");
		lhs.add("keyboard");
		lhs.add("mouse");
		lhs.add("ups");
		lhs.add("speakers");
		System.out.println(lhs.add("monitor")); // false
		System.out.println(lhs); // [monitor, keyboard, mouse, ups, speakers]
	}
}

package collections;
import java.util.*;

public class HashSet {
	public static void main(String[] args) {
		// HashSet - unordered & no duplicates
		HashSet hs = new HashSet();
		hs.add("monitor");
		hs.add("keyboard");
		hs.add("mouse");
		hs.add("ups");
		hs.add("speakers");
		System.out.println(hs.add("monitor")); // false
		System.out.println(hs); // [keyboard, mouse, speakers, ups, monitor]
	}
}

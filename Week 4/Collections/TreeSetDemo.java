package collections;
import java.util.*;

public class TreeSetDemo {
	public static void main(String[] args) {
		// TreeSet - sorted
	    TreeSet ts = new TreeSet();
		ts.add("monitor");
		ts.add("keyboard");
		ts.add("mouse");
		ts.add("ups");
		ts.add("speakers");
		System.out.println(ts); // [keyboard, monitor, mouse, speakers, ups]
		System.out.println(ts.descendingSet()); // [ups, speakers, mouse, monitor, keyboard]
	}
}

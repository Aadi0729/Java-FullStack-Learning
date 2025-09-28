package collections;
import java.util.*;

public class TreeMapDemo {
	public static void main(String[] args) {
		
		// TreeMap - sorted based on keys
		TreeMap tm = new TreeMap();
		tm.put("monitor", 5000);
		tm.put("keyboard", 500);
		tm.put("mouse", 300);
		tm.put("ups", 2000);
		tm.put("speakers", 1000);
		System.out.println(tm); //{keyboard=500, monitor-5000, mouse=300, speakers= speakers=1000, ups=2000}
		System.out.println(tm.descendingMap()); //{ups=2000, speakers=1000, mouse=300, monitor-5000, keyboard=500}
	}
}

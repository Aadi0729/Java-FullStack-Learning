package collections;
import java.util.*;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		
		// LinkedHashMap - ordered based on keys
		LinkedHashMap lhm = new LinkedHashMap();
		lhm.put("monitor", 5000);
		lhm.put("keyboard", 500);
		lhm.put("mouse", 300);
		lhm.put("ups", 2000);
		lhm.put("speakers", 1000);
		System.out.println(lhm); // {monitor-5000, keyboard=500, mouse=300, ups=2000, speakers=1000}
	}
}

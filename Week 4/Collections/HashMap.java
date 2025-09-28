package collections;
import java.util.*;

public class HashMap {
	public static void main(String[] args) {
		// HashMap - unordered based on keys
		HashMap hm = new HashMap();
		hm.put("monitor", 5000);
		hm.put("keyboard", 500);
		hm.put("mouse", 300);
		hm.put("ups", 2000);
		hm.put("speakers", 1000);
		System.out.println(hm); // {keyboard=500, mouse 300, speakers=1000, ups 2000, monitor=5000}
	}
}

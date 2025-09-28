package collections;
import java.util.*;

public class IterateMapDemo {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("monitor", 5000);
		hm.put("keyboard", 500);
		hm.put("mouse", 300);
		hm.put("ups", 2000);
		hm.put("speakers", 1000);
		System.out.println(hm);
		Set<String> keys = hm.keySet();
		for(String k: keys)
		System.out.println(k+":"+hm.get(k));
	}
}

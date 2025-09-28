// Performance-wise, all the methods like add(), remove() etc works more faster in LinkedList as compared to ArrayList

package collections;
import java.util.*;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		
		LinkedList al = new LinkedList();
		al.add(10);
		al.add(20);
		al.add("ppp");
		al.add("qqq");
		al.add(10);
		System.out.println(al); //[10, 20, ppp, qqq, 10]
		al.add(2, "xxx");
		System.out.println(al); //[10, 20, xxx, ppp, qqq, 10]
		al.set(2, "yyy");
		System.out.println(al); //[10, 20, yyy, ppp, qqq, 10]
		al.remove("yyy");
		System.out.println(al); //[10, 20, ppp,qqq, 10]
		al.remove(2);
		System.out.println(al); //[10,20,qqq, 10]
		String s = (String) al.get(2);
		System.out.println(s); //qqq
		System.out.println("Size = "+al.size()); //Size = 4
	}
}

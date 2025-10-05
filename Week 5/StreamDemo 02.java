package streamapi;
import java.util.*;
import java.util.stream.*;

class Product {
	int pid;
	String pname;
	int price;
	
	public Product (int pid, String pname, int price) {
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}
	
	public Product() {}
	
	public String toString() {
		return pid+" "+pname+" "+price;
	}
}

public class StreamDemo1 {
	public static void main(String[] args) {
		
		/* 
		This is the way we use to work before JAVA 8 Version without using Stream API because here only 5 products were there.
		There can be 1000s of products, so performance-wise this will get degraded. 
		*/
		System.out.println("----Without using Stream API----");
		List<Product> list1 = new ArrayList<>();
		
		for(Product prod : getProducts()) {
			if(prod.price > 1000)
				list1.add(prod);
		}
		list1.forEach(System.out::println);
		
		// Using Stream API - To increase the performance of an application
		System.out.println("----Using Stream API----");
		List<Product> list2 = getProducts().stream().filter((prod) -> prod.price > 1000).collect(Collectors.toList());
		list2.forEach(System.out::println);
	}
	
	private static List<Product> getProducts() {
		List<Product> prodList = new ArrayList<>();
		prodList.add(new Product (101, "monitor", 5000));
		prodList.add(new Product (102, "keyboard", 500));
		prodList.add(new Product(103, "mouse", 300));
		prodList.add(new Product (104, "ups", 2000));
		prodList.add(new Product (105, "speakers", 1000));
		return prodList;
	}
}

package streamapi;
import java.util.*;
import java.util.stream.*;

public class StreamDemo {
	public static void main(String[] args) {
		
		// Ways of traversing a collection
		List<String> fruits = List.of("apple", "mango", "orange");
		System.out.println(fruits);//[apple, mango, orange]
		
		// Using traditional for loop 
		for(int i=0;i<fruits.size();i++) 
			System.out.println(fruits.get(i));
		
		// Using Enhanced for loop - added in Java 5 version 
		for(String fruit : fruits)
		System.out.println(fruit);
		
		// Using forEach() added in Java 8 version 
		fruits.forEach(fruit -> System.out.println(fruit));
		
		// Using method reference added in Java 8 version
		fruits.forEach(System.out::println);
		
		// Creating a Stream using List 
		Stream<String> stream1 = fruits.stream(); 
		stream1.forEach(System.out::println);
		
		// Creating a Stream using Set
		Set<String> set1 = new HashSet<>(fruits);
		Stream<String> stream2 = set1.stream();
		stream2.forEach(System.out::println);
		
		// Creating a Stream using Arrays 
		String[] strArray = {"p", "q", "r"};
		Stream<String> stream3 = Arrays.stream(strArray);
		stream3.forEach(System.out::println);
	}
}

package sophisticatedApplications;

/*
 * (参数列表)->{方法体}
 * eg:
 * (x,y)->{
 * 	System.out.println(x);
 * 	System.out.println(y);
 * 	return x+y;
 * }
 */

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] input = {"tiger", "cat", "TIGER", "Tiger", "leopard"}; 
		List<String> cats = Arrays.asList(input); 
		String search = "tiger"; 
		String tigers = cats.stream().filter(s -> s.equalsIgnoreCase(search)).collect(Collectors.joining(", ")); 
		System.out.println(tigers);
		
		Predicate<String> p = s -> s.equalsIgnoreCase(search); 
		Predicate<String> combined = p.or(s -> s.equals("leopard")); 
		String pride = cats.stream()
				.filter(combined)
				.collect(Collectors.joining(", ")); 
		System.out.println(pride);

		
		List<String> pets =   Arrays.asList("dog", "cat", "fish", "iguana", "ferret"); 
		pets.stream().forEach(System.out::println);
		
		double sumPrimes = ((double)Stream.of(2, 3, 5, 7, 11, 13, 17, 19, 23)
				.reduce(0, (x, y) -> {return x + y;})); 
		System.out.println("Sum of some primes: " + sumPrimes);
		

	}

}

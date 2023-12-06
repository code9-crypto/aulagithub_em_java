package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exemplo2 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3,4,5,10,7);
		System.out.println("Lista desordenada");
		list.forEach(System.out::println);
		System.out.println();
		
		System.out.println("Lista ordenada");	
		list.sort((p, q) -> p.compareTo(q));
		list.forEach(System.out::println);
		System.out.println();
		
		Stream<Integer> st1 = list.stream().map(x -> x * 10);
		System.out.println(Arrays.toString(st1.toArray()));
		
		int sum = list.stream().reduce(0, (x,y) -> x + y);
		System.out.println("Sum = " + sum);
		
		List<Integer> newList = list.stream().filter(x -> x % 2 == 0).map(x -> x * 10).collect(Collectors.toList());
		System.out.println(Arrays.toString(newList.toArray()));
	}

}

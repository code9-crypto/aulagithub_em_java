package application;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exemplo2 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3,4,5,10,7);
		System.out.println("Lista desordenada");
		list.forEach(System.out::println);
		System.out.println();
		
		System.out.println("Lista ordenada com list.sort()");	
		list.sort((p, q) -> p.compareTo(q));
		list.forEach(System.out::print);
		System.out.println();
		System.out.println();
		
		System.out.println("List ordenada com Collections.sort() ");
		Collections.sort(list);
		System.out.println(list);
		System.out.println();
		
		System.out.println("Fazendo a multiplicação de cada valor por 10 e gerando uma lista através de uma stream");
		Stream<Integer> st1 = list.stream().map(x -> x * 10);
		System.out.println(Arrays.toString(st1.toArray()));
		System.out.println();
		
		System.out.println("Fazendo somatória com o método reduce() e atribuindo o valor a uma variável");
		int sum = list.stream().reduce(0, (x,y) -> x + y);
		System.out.println("Sum = " + sum);
		System.out.println();
		
		System.out.println("Gerando uma nova lista com os métodos filter() e o map()");
		List<Integer> newList = list.stream().filter(x -> x % 2 == 0).map(x -> x * 10).collect(Collectors.toList());
		System.out.println(Arrays.toString(newList.toArray()));
	}

}

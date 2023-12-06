package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplo4 {

	public static void main(String[] args) {
		List<Product> listaProd = new ArrayList<>();
		
		listaProd.add(new Product("TV", 900.00));
		listaProd.add(new Product("Mouse", 50.00));
		listaProd.add(new Product("Tablet", 350.00));
		listaProd.add(new Product("HD Case", 80.90));
		
		List<String> names = listaProd.stream()
				.map(x -> x.getName().toUpperCase())
				.collect(Collectors.toList());
		
		List<Double> precos = listaProd.stream()
				.map(x -> x.getPrice())
				.collect(Collectors.toList());
				
		names.forEach(System.out::println);
		precos.forEach(System.out::println);

	}

}

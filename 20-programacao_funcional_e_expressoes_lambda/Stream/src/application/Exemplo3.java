package application;

import java.util.ArrayList;
import java.util.List;

public class Exemplo3 {

	public static void main(String[] args) {
		
		List<Product> listaProd = new ArrayList<>();
		
		listaProd.add(new Product("TV", 900.00));
		listaProd.add(new Product("Mouse", 50.00));
		listaProd.add(new Product("Tablet", 350.00));
		listaProd.add(new Product("HD Case", 80.90));
		
		listaProd.removeIf(x -> x.getPrice() >= 100);
		listaProd.forEach(System.out::println);

	}

}

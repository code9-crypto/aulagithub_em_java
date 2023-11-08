package application;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Set<Product> set = new HashSet<>();
		
		set.add(new Product("TV", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));
		
		Product prod = new Product("Notebook", 1200.0);
		
		//Esta impressão deu false porque na classe product não tem implementado as funções hashCode e equals
		//E a verificação que está sendo feita é mediante aos objetos instanciados
		//Para que o teste de igual dê verdadeiro é necessário que as funções mencionadas sejam implementados na classe
		System.out.println(set.contains(prod));
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("AGORA ENTENDENDO A ORDENAÇÃO DO TREESET");
		System.out.println("------------------------------------------------------------------------------------------");
		
		Set<Product> tree = new TreeSet<>();
		
		tree.add(new Product("Computador", 500.00));
		tree.add(new Product("Video Game", 1500.00));
		tree.add(new Product("Microondas", 800.00));
		tree.add(new Product("Geladeira", 900.00));
		tree.add(new Product("Videocassete", 2000.00));
		
		for ( Product p : tree ) {
			System.out.println(p);
		}
		


	}

}

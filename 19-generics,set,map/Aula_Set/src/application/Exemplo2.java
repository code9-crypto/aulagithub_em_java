package application;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Exemplo2 {

	public static void main(String[] args) {
		Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));
		
		//union
		Set<Integer> c = new TreeSet<>(a);
		c.addAll(b);
		System.out.println("União dos conjuntos 'a' e 'b' com o método addAll(): " + c);
		
		//intersection
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b);
		System.out.println("Intersecção dos conjuntos 'a' e 'b' com o método retainAll(): " + d);
		
		//difference
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b);
		System.out.println("Diferença dos conjuntos 'a' e 'b' com o método removeAll(): " + e);

	}

}

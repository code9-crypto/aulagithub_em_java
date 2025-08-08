public class Exemplo2 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3,4,5,10,7);
		System.out.println("Lista ordenada com list.sort()");	
		list.sort((p, q) -> p.compareTo(q));
		list.forEach(System.out::print);
		System.out.println();
		System.out.println();
		
		OU

		System.out.println("List ordenada com Collections.sort() ");
		Collections.sort(list);
		System.out.println(list);
		System.out.println();
	}
}

//ORDENANDO VETOR
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    String[] cars = {"Volvo", "BMW", "Tesla", "Ford", "Fiat", "Mazda", "Audi"};
    Arrays.sort(cars); //a ordenação está acontecendo aqui
    for (String i : cars) {
      System.out.println(i);
    }
  }
}
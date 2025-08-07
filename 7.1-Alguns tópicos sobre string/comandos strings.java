//EXPRESSÃO LAMBDA COM FOREACH
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(5);
    numbers.add(9);
    numbers.add(8);
    numbers.add(1);
    numbers.forEach( (n) -> System.out.println(n % 2 == 0) ); //expressão lambda com forEach
  }
}

//ORDENANDO ARRAY
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

//TRANSFORMANDO STRING EM ARRAY
public class Main {
  public static void main(String[] args) {
    String myStr = "Hello";
    char[] myArray = myStr.toCharArray(); //a transformação está ocorrendo aqui
    for( char l : myArray ){
    	System.out.println(l);
    }
  }
}

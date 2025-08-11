//TRANSFORMANDO STRING EM ARRAY COM O MÉTODO  toCharArray()
public class Main {
  public static void main(String[] args) {
    String myStr = "Hello";
    char[] myArray = myStr.toCharArray(); //a transformação está ocorrendo aqui
    for( char l : myArray ){
    	System.out.println(l);
    }
  }
}

//TRANSFORMANDO UM TEXTO EM ARRAY DE STRINGS COM O MÉTODO split + expressão regular
public class Main {
  public static void main(String[] args) {
    String myStr = "Split a string by spaces, and also punctuation.";
    String regex = "[,\\.\\s]"; //expressão regular que busca por vírgulas, pontos e espaçamento dentro do texto
    String[] myArray = myStr.split(regex);    
    for (String s : myArray) {
	    System.out.println(s);
      //Resultado: 
      /*
      Split
      a
      String
      by
      Spaces
      and
      also
      ponctuation
      */
    }
  }
}

//CONCATENANDO OS ELEMENTOS DE UMA LISTA OU ARRAY(VETOR) COM O MÉTODO join()
public static void main(String[] args) {
  //List<String> fruits = Arrays.asList("Orange", "Apple", "Mango");
  String[] letras = {"a","e","i","o","u"};
  String fruitas = String.join("", letras);
  System.out.println(fruitas);		
}

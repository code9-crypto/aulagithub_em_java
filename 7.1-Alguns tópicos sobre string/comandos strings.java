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

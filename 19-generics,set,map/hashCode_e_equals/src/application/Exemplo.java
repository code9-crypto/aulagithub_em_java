package application;

import entities.Client;

public class Exemplo {

	public static void main(String[] args) {
		String a = "William";
		String b = "Ester";
		//Comparando usando apenas o método equals()
		System.out.println("Comparação com método equals(): " + a.equals(b));
		
		//Comparando usando os métodos hashCode()
		System.out.println("Comparação com método hashCode(): " + (a.hashCode() == b.hashCode()));
		
		//Comparando usando os métodos hashCode() e equals()
		if( a.hashCode() == b.hashCode() ) {
			System.out.println("Comparando usando os dois métodos hashCode() e equals(): " + a.equals(b));
		}else {
			System.out.println("Comparando usando os dois métodos hashCode() e equals(): " + a.equals(b));
		}
		
		System.out.println("-----------------------------------------------------------------------------------");
		
		System.out.println("AGORA USANDO CLASSE");
		
		Client c1 = new Client("Ester","123456");
		Client c2 = new Client("Hadassa","123456");
		
		System.out.println("Comparando a instância c1 com c2 usando o método equals(): " + c1.equals(c2));
		System.out.println("Comparando a instância c1 com c2 usando o método hashCode():");
		System.out.println("c1 -> " + c1.hashCode() + "| c2 -> " + c2.hashCode() + " = " + (c1.hashCode() == c2.hashCode()));
		if( c1.hashCode() == c2.hashCode()) {
			System.out.println("Comparando usando os dois métodos hashCode() e equals(): "+ c1.equals(c2));
		}else {
			System.out.println("Comparando usando os dois métodos hashCode() e equals(): "+ c1.equals(c2));
		}
	}
}

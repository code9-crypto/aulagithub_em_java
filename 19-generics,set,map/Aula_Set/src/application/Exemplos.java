package application;

import java.util.Set;
import java.util.TreeSet;

public class Exemplos {

	public static void main(String[] args) {
		//Set<String> set = new HashSet<>(); mais rápido, mas não ordena os elementos
		Set<String> set = new TreeSet<>(); //mais lento, porém ordena os elementos 
		//Set<String> set = new LinkedHashSet<>(); velocidade intermediária e mantém a ordem na qual foram inseridos os elementos
		
		
		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");
		set.add("VideoGame");
		set.add("Geladeira");
		set.add("Microondas");
		
		System.out.println("Verificado se existe 'Notebook' no conjunto: " + set.contains("Notebook"));
		set.remove("Tablet");
		System.out.println("Removido 'Tablet' do conjunto");
		System.out.println();
		
		for (String p : set) {
			System.out.println(p);
		}
		
		System.out.println();		
		System.out.println("--------------------------------------------------------------------------------------------");
		System.out.println("Testando as demais funções");
		System.out.println("--------------------------------------------------------------------------------------------");
		System.out.println();
		
		set.add("Computador");
		System.out.println("Adicionado 'Computador' no conjunto");
		for (String p : set) {
			System.out.println(p);
		}
		System.out.println();
		
		System.out.println("Removido item do conjunto baseado num predicado:");
		//set.removeIf(x -> x.length() >= 3); este remove todas as strings que tenha mais do que 3 letras
		set.removeIf(x -> x.charAt(0) == 'T'); //este remove todas as strings que iniciam com a letra t maiúscula
		for (String p : set) {
			System.out.println(p);
		}
	}

}

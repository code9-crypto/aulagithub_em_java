package vetores_e_listas;

import java.util.Scanner;

public class mais_velho {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas você vai digitar? ") ;
		int n = sc.nextInt();
		
		String[] vectNomes = new String[n];
		int[] vectIdades = new int[n];
		
		for( int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa");
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			vectNomes[i] = nome;
			vectIdades[i] = idade;
		}
		
		int mais_velho = 0;
		String nome_mais_velho = "";
		for( int k = 0; k < n; k++ ) {
			if( vectIdades[k] > mais_velho ) {
				mais_velho = vectIdades[k];
				nome_mais_velho = vectNomes[k];
			}
		}
		System.out.println("PESSOAS MAIS VELHA: " + nome_mais_velho);
	}
}

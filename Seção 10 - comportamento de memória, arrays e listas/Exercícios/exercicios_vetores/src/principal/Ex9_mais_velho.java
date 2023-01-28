package principal;

import java.util.Scanner;

public class Ex9_mais_velho {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas você vai digitar? ");
		int n = sc.nextInt();
		
		String[] vectNomes = new String[n];
		int[] vectIdades = new int[n];
		
		for( int i = 0; i < n; i++ ) {
			System.out.println("Dados da "+(i+1)+"ª pessoa: ");
			System.out.print("Nome: ");
			vectNomes[i] = sc.next();
			System.out.print("Idade: ");
			vectIdades[i] = sc.nextInt();
		}
		
		int maior = 0;
		String maisVelho = null;
		
		for( int i = 0; i < n; i++ ){
			if(vectIdades[i] > maior) {
				maior = vectIdades[i];
				maisVelho = vectNomes[i];
			}			
		}
		
		System.out.printf("PESSOA MAIS VELHA: %s", maisVelho);		
		
		sc.close();
	}

}

package vetores_e_listas;

import java.util.Scanner;

public class numeros_pares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		//Criando o vetor em cima do valor digitado pelo usuário
		int[] nums = new int[n];
		
		for( int i = 0; i < nums.length; i++ ) {
			System.out.print("Digite um número: ");
			nums[i] = sc.nextInt();
		}
		
		System.out.println();
		
		System.out.println("NÚMEROS PARES:");
		int cont = 0;
		for( int k = 0; k < nums.length; k++ ) {
			if( nums[k] % 2 == 0 ) {
				cont += 1;
				System.out.print(nums[k] + "  ");
			}
		}
		
		System.out.println();
		System.out.println();
		
		System.out.print("QUANTIDADE DE PARES = " + cont);

	}

}

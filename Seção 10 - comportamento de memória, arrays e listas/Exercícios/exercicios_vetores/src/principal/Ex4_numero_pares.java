package principal;

import java.util.Scanner;

public class Ex4_numero_pares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		int[] vectQtd = new int[n];
		
		for (int i=0; i<n; i++) {
			System.out.print("Digite um número: ");
			vectQtd[i] = sc.nextInt();
		}
		System.out.println();
		
		int qtd = 0;
		System.out.println("NÚMEROS PARES:");
		for (int i=0; i<n; i++) {
			
			if(vectQtd[i] % 2 == 0) {
				System.out.print(vectQtd[i] + " ");
				qtd += 1;
			}
		}
		System.out.println();
		System.out.println();
		
		System.out.printf("QUANTIDADE DE PARES =  %d", qtd);
		
		sc.close();
	}

}

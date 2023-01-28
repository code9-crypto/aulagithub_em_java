package principal;

import java.util.Scanner;

public class Ex6_soma_vetores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();
		
		int[] vectA = new int[n];
		int[] vectB = new int[n];
		int[] vectC = new int[n];
		
		//Recebendo os valores no vetor A
		System.out.println("Digite os valores do vetor A:");
		for( int i = 0; i < n; i++ ) {
			vectA[i] = sc.nextInt();
		}
		
		//Recebendo os valores no vetor B
		System.out.println("Digite os valores do vetor B:");
		for ( int i = 0; i < n; i++ ) {
			vectB[i] = sc.nextInt();
		}
		
		//Somando e mostrando os elementos em A e B, e atribuindo ao vetor C
		System.out.println("VETOR RESULTANDO:");
		for ( int i = 0; i < n; i++ ) {
			vectC[i] = vectA[i] + vectB[i];
			System.out.println(vectC[i]);
		}
		
		sc.close();
	}

}

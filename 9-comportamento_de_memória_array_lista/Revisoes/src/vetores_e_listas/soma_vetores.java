package vetores_e_listas;

import java.util.Scanner;

public class soma_vetores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter cada vetor: ");
		int n = sc.nextInt();
		
		//Criando os dois vetores baseados no valor digitado pelo usuário
		int[] vectA = new int[n];
		int[] vectB = new int[n];
		int[] vectC = new int[n];
		
		System.out.println("Digite os valores do vetor A:");
		for( int i = 0; i < vectA.length; i++ ) {
			vectA[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B:");
		for( int k = 0; k < vectB.length; k++ ) {
			vectB[k] = sc.nextInt();
		}
		
		System.out.println("VALOR RESULTANTE:");
		for( int y = 0; y < vectC.length; y++ ) {
			vectC[y] = vectA[y] + vectB[y];
			System.out.println(vectC[y]);
		}
		
		sc.close();
	}

}

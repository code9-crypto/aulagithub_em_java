package vetores_e_listas;

import java.util.Locale;
import java.util.Scanner;

public class media_pares {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		int[] vectNum = new int[n];
		
		for( int i = 0; i < vectNum.length; i++ ) {
			System.out.print("Digite um número: ");
			int val = sc.nextInt();
			vectNum[i] = val;
		}
		double sum = 0.0;		
		int cont = 0;
		for( int k = 0; k < vectNum.length; k++ ) {
			if( vectNum[k] % 2 == 0 ){
				sum += vectNum[k];
				cont += 1;
			}
		}
		double media = sum / cont;
		if( cont != 0) {
			System.out.printf("MÉDIA DOS PARES = %.1f%n", media);
		}else {
			System.out.println("NENHUM NÚMERO PAR");
		}
	}

}

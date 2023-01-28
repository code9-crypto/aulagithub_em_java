package principal;

import java.util.Locale;
import java.util.Scanner;

public class Ex8_media_pares {

	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for( int i = 0; i < n; i++ ) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
		}
		
		double soma = 0.0;
		double qtd_par = 0.0;
		for( int i = 0; i < n; i++ ) {
			if( vect[i] % 2 == 0 ) {
				soma += vect[i];
				qtd_par += 1;
			}
		}
		
		double media = soma / qtd_par;
		if( soma != 0.0 ) {
			System.out.printf("MÉDIA DOS PARES = %.1f%n", media);
		}else {
			System.out.println("NENHUM NÚMERO PAR");
		}
		
		sc.close();
	}

}

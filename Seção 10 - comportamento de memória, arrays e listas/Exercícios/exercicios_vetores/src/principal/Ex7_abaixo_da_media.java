package principal;

import java.util.Locale;
import java.util.Scanner;

public class Ex7_abaixo_da_media {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		double[] vectN = new double[n];
		
		for( int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vectN[i] = sc.nextDouble();
		}
		
		double soma = 0.0;
		for( int i = 0; i < n; i++ ) {
			soma += vectN[i];
		}
		System.out.println();
		
		double mediaVect = soma / n;
		System.out.printf("MÉDIA DO VETOR = %.3f%n", mediaVect);
		
		System.out.println("ELEMENTOS ABAIXO DA MÉDIA");
		for( int i = 0; i < n; i++ ) {
			if( vectN[i] < mediaVect ) {
				System.out.println(vectN[i]);
			}
		}
		
		sc.close();
	}

}

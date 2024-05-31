package vetores_e_listas;

import java.util.Locale;
import java.util.Scanner;

public class soma_vetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quanto números vai digitar? ");
		int n = sc.nextInt();
		
		//Declarando vetor
		double[] vect = new double[n];

		for ( int i = 0; i < vect.length; i++ ) {
			System.out.print("Digite um número: ");
			double num = sc.nextDouble();
			vect[i] = num;
		}
		
		System.out.println();
		
		System.out.print("VALORES: ");
		for ( int k = 0; k < vect.length; k++ ) {
			System.out.print( String.format("%.1f", vect[k]) + "    " );
		}
		
		System.out.println();
		
		double sum = 0.0;
		for ( int f = 0; f < vect.length; f++ ) {
			sum += vect[f];
		}
		System.out.print("SOMA: " + String.format("%.2f", sum));
		
		System.out.println();
		
		double media = sum / vect.length;
		System.out.print("MEDIA: " + String.format("%.2f", media));
	}

}

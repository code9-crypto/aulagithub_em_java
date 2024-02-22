package vetores_e_listas;

import java.util.Locale;
import java.util.Scanner;

public class maior_posicao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Recebendo valor do usuário para depois criar o vetor
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		//Criando vetor em cima do valor recebido do usuário
		double[] vect = new double[n];
		
		//Recebendo dados do usuário
		for( int i = 0; i < vect.length; i++ ) {
			System.out.print("Digite um número: ");
			double dig = sc.nextDouble();
			vect[i] = dig;
		}
		
		double maior = 0.0;
		int posicao = 0;
		for( int k = 0; k < vect.length; k++ ) {
			if( vect[k] > maior ) {
				maior = vect[k];
				posicao = k;
			}			
		}
		
		System.out.println();
		System.out.println("MAIOR VALOR: " + String.format("%.1f", maior));
		System.out.print("POSICAO DO MAIOR VALOR: " + posicao);

	}

}

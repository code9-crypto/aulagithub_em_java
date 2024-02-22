package vetores_e_listas;

import java.util.Locale;
import java.util.Scanner;

public class abaixo_da_media {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Recebendo valor para do usuário para criar o vetor
		System.out.print("Quanto elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		//Criando o vetor em cima do valor digitado pelo usuário
		double[] vectVal = new double[n];
		
		//Laço de repetição para receber dados do usuário
		for( int i = 0; i < vectVal.length; i++ ) {
			System.out.print("Digite um número: ");
			double val = sc.nextDouble();
			vectVal[i] = val;
		}
		System.out.println();
		
		//Encontrando a média do vetor
		double sum = 0.0;
		double media = 0.0;
		for( int k = 0; k < vectVal.length; k++) {
			sum += vectVal[k];
		}
		media = sum / vectVal.length;
		System.out.printf("MEDIA DO VETOR =  %.3f%n", media);
		
		System.out.println("ELEMENTOS ABAIXO DA MÉDIA:");
		//Encontrando os elementos abaixo da média
		for( int y = 0; y < vectVal.length; y++ ) {
			if( vectVal[y] < media ) {
				System.out.printf("%.1f%n", vectVal[y]);
			}
		}
		
		sc.close();
	}

}

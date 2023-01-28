package principal;

import java.util.Locale;
import java.util.Scanner;

public class Ex5_maior_posicao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		double[] vectNum = new double[n];
		
		for (int i=0; i<n; i++) {
			System.out.print("Digite um número: ");
			vectNum[i] = sc.nextDouble();
		}
		System.out.println();
		
		//Verificando o maior valor
		double maior = 0.0;
		int posicao = 0;
		
		for (int i=0; i<n; i++) {
			if(vectNum[i] > maior) {
				maior = vectNum[i];
				posicao = i;
			}
		}
				
		System.out.printf("MAIOR VALOR = %.2f%n", maior);
		System.out.printf("POSICAO DO MAIOR VALOR = %d", posicao);
		
		sc.close();
	}

}

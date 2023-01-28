package principal;

import java.util.Locale;
import java.util.Scanner;

public class Ex2_soma_vetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos números você vai digitar: ");
		int n = sc.nextInt();		
		double[] vectNum = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vectNum[i] = sc.nextDouble();
		}
		
		double soma = 0.0;
		for (int i = 0; i < n; i++) {
			soma += vectNum[i]; 
		}
		
		double media = soma / n;
		System.out.println();
		
		System.out.print("VALORES = ");
		for (int i = 0; i < n; i++) {
			System.out.print(vectNum[i] + " ");
		}
		System.out.println();
		
		System.out.printf("SOMA = %.2f%n", soma);
		System.out.printf("MÉDIA = %.2f%n", media);		
		
		sc.close();

	}

}

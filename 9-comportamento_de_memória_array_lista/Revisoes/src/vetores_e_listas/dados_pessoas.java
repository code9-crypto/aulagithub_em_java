package vetores_e_listas;

import java.util.Locale;
import java.util.Scanner;

import vetores_e_listas.entities.DadosPessoa;

public class dados_pessoas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		
		DadosPessoa[] vectPessoa = new DadosPessoa[n];
		
		for( int i = 0; i < vectPessoa.length; i++ ) {
			System.out.print("Altura da " + (i+1) + "a pessoa: ");
			double alt = sc.nextDouble();
			System.out.print("Gênero da " + (i+1) + "a pessoa: ");
			char gen = sc.next().charAt(0);
			vectPessoa[i] = new DadosPessoa(alt, gen);
		}
		
		double menorAltura = vectPessoa[0].getAltura();
		double maiorAltura = 0.0;
		double sumMulheres = 0.0;
		int contHomens = 0;
		int contMulheres = 0;
		for( int k = 0; k < vectPessoa.length; k++ ) {			
			if( vectPessoa[k].getAltura() > maiorAltura ) {
				maiorAltura = vectPessoa[k].getAltura();
			}
			
			if( vectPessoa[k].getAltura() < menorAltura ) {
				menorAltura = vectPessoa[k].getAltura();
			}
			
			if( vectPessoa[k].getGenero() == 'F' ) {
				sumMulheres += vectPessoa[k].getAltura();
				contMulheres += 1;
			}
			
			if( vectPessoa[k].getGenero() == 'M' ) {
				contHomens += 1;
			}
		}
		
		double mediaMulheres = sumMulheres / contMulheres;
		
		System.out.printf("Menor altura = %.2f%n", menorAltura);
		System.out.printf("Maior altura = %.2f%n", maiorAltura);
		System.out.printf("Media das alturas das mulheres =  %.2f%n", mediaMulheres);
		System.out.printf("Número de homens = " + contHomens);
		
		sc.close();		
	}

}

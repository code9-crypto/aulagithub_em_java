package principal;

import java.util.Locale;
import java.util.Scanner;

import entidades.Dados_pessoas;

public class Ex11_dados_pessoas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		
		Dados_pessoas[] vectPessoas = new Dados_pessoas[n];
		double altura;
		char genero;
		for( int i = 0; i < n; i++ ) {
			System.out.print("Altura da "+(i+1)+"ª pessoa: ");
			altura = sc.nextDouble();
			System.out.print("Genero da "+(i+1)+"ª pessoa: ");
			genero = sc.next().charAt(0);
			vectPessoas[i] = new Dados_pessoas(altura, genero);
		}
		
		//Calculando e mostrando e MENOR e a MAIOR altura
		double maiorAltura = 0.0;
		double menorAltura = vectPessoas[0].getAltura();
		for( int i = 0; i < n; i++ ) {
			if( vectPessoas[i].getAltura() > maiorAltura ) {
				maiorAltura = vectPessoas[i].getAltura();
			}
			
			if( vectPessoas[i].getAltura() < menorAltura ) {
				menorAltura = vectPessoas[i].getAltura();
			}
		}
		
		System.out.printf("Menor altura = %.2f%n", menorAltura);
		System.out.printf("Maior altura = %.2f%n", maiorAltura);
		
		//Calculando e mostrando a média das mulheres
		double soma = 0.0;
		double media = 0.0;
		int qtdMulheres = 0;
		for( int i = 0; i < n; i++ ) {
			if ( vectPessoas[i].getGenero() == 'F' ) {
				soma += vectPessoas[i].getAltura();
				qtdMulheres += 1;
			}
		}
		media = soma / qtdMulheres;
		System.out.printf("Média das alturas das mulheres = %.2f%n", media);
		
		
		//Calculando e mostrando a quantidade de homens
		int qtdHomens = 0;
		for( int i = 0; i < n; i++ ) {
			if( vectPessoas[i].getGenero() == 'M' ) {
				qtdHomens += 1;
			}
		}
		System.out.printf("Número de homens = %d", qtdHomens);
		
		
		sc.close();
	}

}

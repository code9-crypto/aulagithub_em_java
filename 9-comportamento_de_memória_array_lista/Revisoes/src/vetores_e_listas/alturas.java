package vetores_e_listas;

import java.util.Locale;
import java.util.Scanner;

import vetores_e_listas.entities.Pessoa;

public class alturas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Recebendo valor do usuário para criar o vetor
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();		
		
		//Declarando vetor
		Pessoa[] vectPes = new Pessoa[n];
		
		//Recebendo dados das pessoas e inserindo no vetor
		for( int i = 0; i < vectPes.length; i++ ) {
			sc.nextLine();
			System.out.println("Dados da " + (i+1) + "a pessoa:");
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();			
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			vectPes[i] = new Pessoa(nome, idade, altura);
		}
		
		//declarando variável para fazer o cálculo médio da altura
		//Aproveitando este laço para fazer o cálculo da porcentagem com pessoas menos de 16 anos
		double alt_med = 0.0;
		int cont = 0;
		for( int k = 0; k < vectPes.length; k++ ) {
			alt_med += vectPes[k].getAltura();
			if( vectPes[k].getIdade() < 16 ) {
				cont += 1;
			}
		}
		
		System.out.println();		
		alt_med = alt_med / vectPes.length;
		System.out.println("Altura média: " + String.format("%.2f", alt_med));
		double porc_ida = (cont * 100.0) / vectPes.length;
		System.out.println("Pessoas com menos de 16 anos: " + String.format("%.1f", porc_ida) + "%");
		
		//Mostrando respectivos no nomes com menos de 16 anos
		for( int y = 0; y < vectPes.length; y++ ) {
			if( vectPes[y].getIdade() < 16 ) {
				System.out.println(vectPes[y].getNome());
			}
		}

	}

}

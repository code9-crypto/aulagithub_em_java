package principal;

import java.util.Locale;
import java.util.Scanner;

import entidades.Dados_altura;

public class Ex3_alturas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas serão digitadas: ");
		int n = sc.nextInt();
		sc.nextLine();
		Dados_altura[] pessoa = new Dados_altura[n]; //criando e estanciando o array da classe
		
		/*
		 Recebendo valores do usuário
		 E referenciando a posição ao seu
		 respectivo objeto
		 */		
		for (int i = 0; i < n; i++) {
			System.out.println("Dados da "+(i+1)+"ª pessoa:");
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			sc.nextLine();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			sc.nextLine();
			pessoa[i] = new Dados_altura(nome, idade, altura);//referencia da posição ao seu objeto
		}
		System.out.println();
		
		//Calculando a média das alturas
		double soma = 0.0;
		for (int i = 0; i < n; i++) {
			soma += pessoa[i].getAltura();
		}		
		double altura = soma / n;
		System.out.printf("Altura média: %.2f%n", altura);
		
		//Calculando a porcentagem da quantidade de pessoas com menos de 16 anos
		int qtd_idade = 0;
		for (int i = 0; i < n; i++) {
			if(pessoa[i].getIdade() < 16) {
				qtd_idade += 1;
			}
		}
		double percentual_total = qtd_idade * 100 / n;
		System.out.print("Pessoas com menos de 16 anos: " + String.format("%.1f", percentual_total)+"%");
		System.out.println();
		
		//Pegando o nome das pessoas com menos de 16 anos
		for (int i = 0; i < n; i++) {
			if (pessoa[i].getIdade() < 16) {
				System.out.println(pessoa[i].getNome());
			}
		}
		
		
		sc.close();
	}

}

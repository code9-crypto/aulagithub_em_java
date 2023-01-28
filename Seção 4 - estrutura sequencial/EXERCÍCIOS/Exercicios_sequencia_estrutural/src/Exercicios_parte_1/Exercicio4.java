package Exercicios_parte_1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int num_func, horas;
		double valor_hora, salario;
		System.out.print("Digite o código do funcionário: ");
		num_func = sc.nextInt();
		System.out.print("Digite às horas trabalhadas: ");
		horas = sc.nextInt();
		System.out.print("Digite o valor que recebe por hora: ");
		valor_hora = sc.nextDouble();
		salario = valor_hora * horas;
		System.out.println("");
		System.out.println("");
		System.out.printf("Código do funcionário: %d%n", num_func);
		System.out.printf("Salário: U$ %.2f", salario);
	}

}

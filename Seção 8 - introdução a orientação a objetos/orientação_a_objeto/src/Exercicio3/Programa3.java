package Exercicio3;

import java.util.Locale;
import java.util.Scanner;

import Entidades.Student;

public class Programa3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student aluno = new Student();
		
		aluno.nome = sc.nextLine();
		aluno.n1 = sc.nextDouble();
		aluno.n2 = sc.nextDouble();
		aluno.n3 = sc.nextDouble();
		
		double resultado = aluno.notaFinal();
		
		if(resultado >= 60) {
			System.out.println("FINAL GRADE = " + String.format("%.2f", resultado));
			System.out.println("PASS");
		}else {
			double reprovado = aluno.notaReprova(resultado);
			System.out.println("FINAL GRADE = " + String.format("%.2f", resultado));
			System.out.println("FAILED");
			System.out.println("MISSING " + String.format("%.2f", reprovado) + " POINTS");
		}
		
		sc.close();

	}

}

package vetores_e_listas;

import java.util.Locale;
import java.util.Scanner;

import vetores_e_listas.entities.Aluno;

public class aprovados {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
		System.out.print("Quanto alunos serão digitados? ");
		int n = sc.nextInt();		
		
		Aluno[] vectAlunos = new Aluno[n];
		
		for( int i = 0; i < vectAlunos.length; i++ ) {
			sc.nextLine();
			System.out.println("Digite nome, primeira e segunda nota do " + (i+1) + "o aluno:");
			String nome = sc.nextLine();
			double n1 = sc.nextDouble();
			double n2 = sc.nextDouble();
			vectAlunos[i] = new Aluno(nome, n1, n2);
		}
		
		System.out.println("Alunos aprovados:");
		double media = 0.0;
		for( int k = 0; k < vectAlunos.length; k++ ) {
			media = (vectAlunos[k].getNota1() + vectAlunos[k].getNota2()) / 2;
			if( media >= 6.0 ) {
				System.out.println(vectAlunos[k].getNome());
			}
		}
		
		sc.close();
	}
}

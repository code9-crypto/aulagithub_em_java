package principal;

import java.util.Locale;
import java.util.Scanner;

import entidades.Dados_alunos;

public class Ex10_aprovados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos alunos serão digitados? ");
		int n = sc.nextInt();
		Dados_alunos[] vectAlunos = new Dados_alunos[n];
		String nome;
		double n1;
		double n2;
		
		
		for( int i = 0; i < n; i++ ) {
			System.out.println("Digite nome, primeira e segunda nota do "+(i+1)+"º aluno");
			sc.nextLine();
			nome = sc.nextLine();			
			n1 = sc.nextDouble();
			n2 = sc.nextDouble();
			vectAlunos[i] = new Dados_alunos(nome, n1, n2);
		}
		
		double verifica = 0.0;
		System.out.println("Alunos aprovados:");
		for( int i = 0; i < n; i++ ) {
			verifica = Dados_alunos.notaFinal(vectAlunos[i].getN1(), vectAlunos[i].getN2());
			if( verifica >= 6.0 ) {
				System.out.println(vectAlunos[i].getNome());
			}
		}
		
		sc.close();
	}

}

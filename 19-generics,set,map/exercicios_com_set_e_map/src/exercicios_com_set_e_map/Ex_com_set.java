package exercicios_com_set_e_map;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex_com_set {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> alunos = new HashSet<>();
		
		System.out.print("How many students for course A: ");
		int a = sc.nextInt();
		for( int i = 0; i < a; i++ ) {
			int alunosA = sc.nextInt();
			alunos.add(alunosA);
		}
		
		System.out.print("How many students for course B: ");
		int b = sc.nextInt();
		for( int i = 0; i < b; i++ ) {
			int alunosB = sc.nextInt();
			alunos.add(alunosB);
		}
		
		System.out.print("How many students for course C: ");
		int c = sc.nextInt();
		for( int i = 0; i < c; i++ ) {
			int alunosC = sc.nextInt();
			alunos.add(alunosC);
		}
		
		System.out.print("Total studens: " + alunos.size());

	}

}

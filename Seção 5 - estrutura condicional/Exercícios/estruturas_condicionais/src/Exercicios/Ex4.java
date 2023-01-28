package Exercicios;

import java.util.Scanner;

public class Ex4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hi,hf,duracao;
		hi = sc.nextInt();
		hf = sc.nextInt();
		
		if( hi >= 13 && hf <= 12 ) {
			duracao = (24 - hi) + hf;
			System.out.printf("O JOGO DUROU %d HORAS", duracao);
		} else if( hi == hf) {
			System.out.println("O JOGO DUROU 24 HORAS");
		} else if(hi <= 12 && hf >= 13) {
			duracao = (12 - hi) + (hf - 12);
			System.out.printf("O JOGO DUROU %d HORAS", duracao);
		}
		
		sc.close();
	}
	
}

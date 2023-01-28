package exercícios;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numdig = sc.nextInt();
		
		//Fica dentro do loop enquanto a condição for verdadeira
		while(numdig != 2002) {
			System.out.println("Senha Inválida");
			numdig = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		
		sc.close();

	}

}

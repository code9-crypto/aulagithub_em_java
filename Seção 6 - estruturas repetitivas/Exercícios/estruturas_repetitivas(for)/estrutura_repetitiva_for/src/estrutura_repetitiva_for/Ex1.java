package estrutura_repetitiva_for;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numdig, teste;
		numdig = sc.nextInt();
		
		for (int i=1; i<numdig; i++) {
			teste = i % 2;
			if(teste != 0) {
				System.out.println(i);
			}			
		}
		
		if(numdig % 2 != 0) {
			System.out.println(numdig);
		}
		
		sc.close();

	}

}

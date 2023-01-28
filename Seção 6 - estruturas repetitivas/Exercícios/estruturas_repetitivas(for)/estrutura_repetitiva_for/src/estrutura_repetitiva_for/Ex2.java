package estrutura_repetitiva_for;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n, x, in, out;
		//Valor da quantidade
		n = sc.nextInt();
		
		//Iniciando as variaveis
		in = 0;
		out = 0;
		
		//Loop do negócio
		for (int i = 1; i <= n; i++) {
			
			x = sc.nextInt();
			if(x >= 10 && x <= 20) {
				in += 1;
			}else {
				out += 1;
			}
			
		}
		
		//mostrando resultados
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		sc.close();

	}

}

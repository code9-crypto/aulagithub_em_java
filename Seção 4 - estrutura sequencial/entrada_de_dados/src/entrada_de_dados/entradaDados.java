package entrada_de_dados;

import java.util.Locale;
import java.util.Scanner;

public class entradaDados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String x;
		int y;
		double z;
		//Só pega a primeira palavra até encontrar espaço
		x = sc.next();
		//pega um valor inteiro
		y = sc.nextInt();
		//pega um valor double
		z = sc.nextDouble();
		System.out.println("Dados digitados");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		
		sc.close();

	}

}

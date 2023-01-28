package exercícios;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.Álcool, 2.Gasolina, 3.Diesel, 4.Fim");
		int alc, gas, die;
		alc = 0;
		gas = 0;
		die = 0;
		int cod = sc.nextInt();
		
		while(cod != 4) {
			switch(cod) {
				case 1:
					alc += 1;
					break;
				case 2:
					gas += 1;
					break;
				case 3:
					die += 1;
					break;
				default:
					System.out.println("Por favor, informe um código entre 1 e 4");
					System.out.println("1.Álcool, 2.Gasolina, 3.Diesel, 4.Fim");
					break;
			}
			cod = sc.nextInt();
		}
		System.out.printf("MUITO OBRIGADO%nAlcool: %d%n"
				+ "Gasolina: %d%n"
				+ "Diesel: %d", alc, gas, die);
		sc.close();

	}

}

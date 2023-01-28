package funcoes_matematicas;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A,B,C;
		
		Locale.setDefault(Locale.US);
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		System.out.println("Raiz quadrada de " + x + " = " + A);
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de 25 = " + C);
		
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		System.out.printf("%.1f elevado a %.2f = %.1f%n", x, y, A);
		System.out.printf("%.1f elevado ao quadrado = %.1f%n", x, B);
		System.out.printf("5 elevado ao quadrado = %.1f%n", C);
		
		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);

	}

}

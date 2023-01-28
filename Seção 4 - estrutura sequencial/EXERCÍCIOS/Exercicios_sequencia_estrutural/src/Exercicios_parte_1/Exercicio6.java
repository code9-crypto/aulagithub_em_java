package Exercicios_parte_1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double a,b,c, areaT, areaC, areaTr, areaQ, areaR, pi;
		pi = 3.14159;
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		areaT = (a * c) / 2.0;
		areaC = pi * (Math.pow(c, 2.0));
		areaTr = ((a + b) * c) / 2.0;
		areaQ = Math.pow(b, 2.0);
		areaR = a * b;
		
		System.out.printf("TRIANGULO: %.3f%n",areaT);
		System.out.printf("CIRCULO: %.3f%n", areaC);
		System.out.printf("TRAPÉZIO: %.3f%n", areaTr);
		System.out.printf("QUADRADO: %.3f%n", areaQ);
		System.out.printf("RETANGULO: %.3f%n", areaR);

	}

}

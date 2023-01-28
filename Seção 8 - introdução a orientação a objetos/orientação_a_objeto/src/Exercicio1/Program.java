package Exercicio1;

import java.util.Locale;
import java.util.Scanner;

import Entidades.Retangulo;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Retangulo calc = new Retangulo();
		
		System.out.println("Enter rectangle width and height:");
		calc.width = sc.nextDouble();
		calc.height = sc.nextDouble();
		
		System.out.println("AREA = "+String.format("%.2f", calc.Area()));
		System.out.println("PERIMETER = "+String.format("%.2f", calc.Perimeter()));
		System.out.println("DIAGONAL = "+String.format("%.2f", calc.Diagonal()));
		
		sc.close();

	}

}

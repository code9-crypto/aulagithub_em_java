package Exercicios;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,total;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(a > b) {
			total = a % b;
			if(total == 0) {
				System.out.println("São Multíplos");
			}else {
				System.out.println("Não são Multíplos");
			}
		} else {
			total = b % a;
			if(total == 0) {
				System.out.println("São Multíplos");
			}else {
				System.out.println("Não são Multíplos");
			}
		}
		
		sc.close();
	}

}

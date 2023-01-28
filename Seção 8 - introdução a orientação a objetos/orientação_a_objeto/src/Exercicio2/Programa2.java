package Exercicio2;

import java.util.Locale;
import java.util.Scanner;

import Entidades.Employee;

public class Programa2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee func = new Employee();
		
		System.out.print("Name: ");
		func.Name = sc.nextLine();
		System.out.print("Gross salary: ");
		func.GrossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		func.Tax = sc.nextDouble();
		System.out.println();
		
		System.out.println("Employee: " + func.Name+", $ "+String.format("%.2f", func.NetSalary()));
		System.out.println();
		
		System.out.println("Which percentage to increase salary? ");
		double per = sc.nextDouble();
		func.IncreaseSalary(per);
		System.out.println();
		
		System.out.println("Updated data: " + func.Name+", $ "+String.format("%.2f", func.GrossSalary));
		
		sc.close();
	}

}

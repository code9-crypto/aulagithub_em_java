package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import application.entities.Employee;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();

		List<Employee> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			System.out.println("Employee #" + (i + 1));
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			list.add(new Employee(id, name, salary));
			System.out.println();
		}

		System.out.print("Enter the employee id that will hava salary increase: ");
		int idEmp = sc.nextInt();
		Employee idEmpSearched = list.stream().filter(x -> x.getId() == idEmp).findFirst().orElse(null);
		if (idEmpSearched == null) {
			System.out.println("This id does not exist!");			
		} else {
			System.out.print("Enter the percentage: ");
			double percEmp = sc.nextDouble();

			for (Employee emp : list) {
				if (emp.getId() == idEmpSearched.getId()) {
					emp.increaseSalary(percEmp);
				}
			}			
		}
		
		System.out.println();
		System.out.println("List of Employees:");
		list.forEach(System.out::println);
		
		sc.close();

	}
}

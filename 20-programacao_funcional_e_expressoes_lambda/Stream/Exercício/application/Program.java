package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//lista para inserir os funcionários
		List<Employee> listaFunc = new ArrayList<>();		
		
		//solicitando do usuário o caminho do arquivo
		System.out.print("Enter full file path: ");		
		String path = sc.next();
		
		//fazendo a leitura de cada linha do arquivo e inserindo na lista
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			while( line != null ) {
				String[] fields = line.split(",");
				listaFunc.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}
			
			//Criando uma nova lista com os emails baseado no salario
			System.out.print("Enter salary: ");
			Double salary = sc.nextDouble();			
			System.out.println("Email of people whose salary is more than " + String.format("%.2f", salary));
			List<String> names = listaFunc.stream()
					.filter(x -> x.getSalary() > salary)
					.map(x -> x.getEmail())
					.collect(Collectors.toList());
			names.sort((a, b) -> a.toLowerCase().compareTo(b.toLowerCase()));
			names.forEach(System.out::println);
			
			//Somando os valores de todos os nomes que iniciam com a letra M
			Double sum = listaFunc.stream()
					.filter(x -> x.getName().charAt(0) == 'M')
					.map(x -> x.getSalary())
					.reduce(0.0, (x, y) -> x + y);
			System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", sum));
			
		}catch(IOException e) {
			System.out.println("Erro na leitura: " + e.getMessage());
		}	
		
		
		sc.close();
	}

}

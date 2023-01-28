package programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.DadosFuncionarios;

public class Lists {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<DadosFuncionarios> list = new ArrayList<>();//Instanciando a lista
		System.out.print("Quantos funcionários serão registrados? ");
		int n = sc.nextInt();
		 
		
		for( int i = 0; i < n; i++ ) {
			System.out.print((i+1)+"º Funcionário");
			System.out.print("ID: ");
			Integer id = sc.nextInt();
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Salario: ");
			Double salario = sc.nextDouble();
			list.add(new DadosFuncionarios(id, nome, salario));
			System.out.println();
		}
		System.out.println();
		
		System.out.print("Entre com a ID do funcionário que irá aumentar o salário: ");
		int id = sc.nextInt();
		
		DadosFuncionarios dado = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if ( dado != null ) {
			System.out.print("Qual a porcentagem de aumento? ");
			double porcentagem = sc.nextDouble();
			dado.aumento(porcentagem);
		}else {
			System.out.println("Esta ID não existe");
		}
		
		System.out.println();
		
		for( DadosFuncionarios func : list ) {
			System.out.println(func);
		}
		
		sc.close();
	}

}

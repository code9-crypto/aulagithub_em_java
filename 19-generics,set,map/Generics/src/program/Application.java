package program;

import java.util.Locale;
import java.util.Scanner;

import Classes.Cliente;
import Classes.Funcionario;
import Classes.Pessoa;
import service.Service;

public class Application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Deseja fazer um cadastro? s(sim) ou n(não)");
		char resp = sc.next().charAt(0);
		
		//Instanciando os serviços 
		Service<Funcionario> funcService = new Service<>();
		Service<Cliente> cliService = new Service<>();
		Service<Pessoa> pesService = new Service<>();
		
		//Perguntando ao usuário se deseja fazer alguma operação
		while(resp == 's') {			
			System.out.println("O que deseja cadastrar? \n"
					+ "1 - Funcionário \n"
					+ "2 - Cliente \n"
					+ "3 - Pessoa");
			int choice = sc.nextInt();			
			
			switch(choice) {
			case 1:				
				System.out.print("Digite o nome do funcionário: ");
				String nome = sc.next();
				System.out.print("Digite o cargo do funcionário: ");
				sc.nextLine();
				String cargo = sc.nextLine();
				System.out.print("Digite o salário do funcionário: ");
				Double salario = sc.nextDouble();
				funcService.addValue(new Funcionario(nome, cargo, salario));
				break;
			case 2:
				System.out.print("Digite o nome do cliente: ");
				nome = sc.next();
				System.out.print("Digite o nome do vendedor do cliente: ");
				String vendedor = sc.next();
				System.out.print("Digite o CEP do cliente: ");
				String cep = sc.next();
				cliService.addValue(new Cliente(nome, vendedor, cep));
				break;
			case 3:
				System.out.print("Digite o nome da pessoa: ");
				nome = sc.next();
				System.out.print("Digite a idade da pessoa: ");
				String idade = sc.next();
				System.out.print("Digite a altura da pessoa: ");
				Double altura = sc.nextDouble();
				pesService.addValue(new Pessoa(nome, idade, altura));
				break;
			default:
				System.out.println("Opção inválida");
			}
			System.out.print("Deseja fazer mais alguma operação? s(sim) ou n(não)");
			resp = sc.next().charAt(0);
		}
		
		System.out.println();
		
		//Exibindo as informações
		funcService.exibirInfos();
		cliService.exibirInfos();
		pesService.exibirInfos();

	}

}

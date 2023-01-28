package principal;

import java.util.Scanner;

import entidades.Dados_Pensionato;

public class ExPensionato {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many rooms will be rented? ");
		int qtdPessoas = sc.nextInt();
		Dados_Pensionato[] aluguel = new Dados_Pensionato[10];
		
		//Recebendo os dados das pessoas
		String name = null;
		String email = null;
		int quarto = 0;
		for ( int i = 0; i < qtdPessoas; i++ ) {
			System.out.println("Rent #" + (i+1));
			sc.nextLine();
			System.out.print("Name: ");
			name = sc.nextLine();
			System.out.print("Email: ");
			email = sc.nextLine();
			System.out.print("Room: ");
			quarto = sc.nextInt();
			aluguel[quarto] = new Dados_Pensionato(name, email);
		}
		
		//Mostrando os quartos ocupados
		System.out.println();
		System.out.println("Busy rooms: ");
		for( int i = 0; i < 9; i++ ) {
			if( aluguel[i] != null) {
				System.out.println(i+": "+aluguel[i].getName()+", "+aluguel[i].getEmail());
			}
		}			
			
		sc.close();
	}	

}

package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ProgramCriandoArquivos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite seu primeiro nome: ");
		String nome = sc.nextLine();
		System.out.print("Digite seu sobrenome: ");
		String sobreNome = sc.nextLine();
		
		String path = "C:\\Users\\r0697537\\Desktop\\pessoal.txt";
		
		/*
		DESTE MODO, O ARQUIVO É CRIADO E CASO JÁ ESTEJA CRIADO
		APAGA E RECRIA DO ZERO
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
			bw.write("Nome: " + nome);
			bw.newLine();
			bw.write("SobreNome: " + sobreNome);
		}catch(IOException e) {
			e.printStackTrace();
		}*/
		
		//Este jeito apenas atualiza os dados no arquivo
		try(BufferedWriter br = new BufferedWriter(new FileWriter(path, true))){
			br.write("Nome: " + nome);
			br.newLine();
			br.write("Sobrenome: " + sobreNome);
			br.newLine();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Fim da inserção");

	}

}

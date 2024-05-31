package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class ProgramExercicio {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
		String path = "C:\\Users\\r0697537\\Desktop\\exercicio_java\\dados.csv";
		
		//Escrevendo no arquivo
		/*try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			
			for( int i  = 0; i < 4; i++ ) {
				System.out.print("Nome do produto: ");
				String nome = sc.nextLine();
				System.out.print("Preço unitário: ");
				Double preco = sc.nextDouble();
				System.out.print("Quantidade: ");
				Integer qtd = sc.nextInt();
				sc.nextLine();
				bw.write(nome + ", " + String.format("%.2f", preco) + ", " + 
				qtd);
				bw.newLine();
			}	
			
		}catch(IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}*/
		
		//Lendo o arquivo criado para criar um novo
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			
			//Criando uma nova sub-pasta e calculando os dados do arquiv lido
			boolean pasta = new File("C:\\Users\\r0697537\\Desktop\\exercicio_java\\out").mkdir();
			String strPath = "C:\\Users\\r0697537\\Desktop\\exercicio_java\\out\\summary.csv";
			while( line != null ) {				
								 
				 if( pasta ) {
					 try(BufferedWriter bw = new BufferedWriter(new FileWriter(strPath, true))){
						 
						 String[] dados = line.split(", ");
						 Double preco = Double.parseDouble(dados[1]);
						 Integer qtd = Integer.parseInt(dados[2]);
						 bw.write(dados[0]+ "," + preco * qtd);
						 bw.newLine();
						 
					 }catch(IOException e) {
						 System.out.println("Erro: " + e.getMessage());
					 }
				 }
				 line = br.readLine();				 
			}
		}catch(IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\r0697537\\Desktop\\exercicio_java\\out\\summary.csv"))){
			
			String linha = br.readLine();
			while( linha != null ) {
				System.out.println(linha);
				linha = br.readLine();
			}
			
		}catch(IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}

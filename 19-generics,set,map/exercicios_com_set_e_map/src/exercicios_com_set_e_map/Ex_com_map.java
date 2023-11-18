package exercicios_com_set_e_map;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ex_com_map {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Candidatos, Integer> contagem = new TreeMap<>();
		
		System.out.print("Enter file full path: ");
		String path = sc.next();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String dadosUrna = br.readLine();
			while(dadosUrna != null) {
				String[] votos = dadosUrna.split(",");
				Candidatos cd = new Candidatos(votos[0]);
				int vote = Integer.parseInt(votos[1]);
				if( contagem.containsKey(cd) ) {
					int votoCandidato = contagem.get(cd);
					contagem.put( new Candidatos(votos[0]), vote + votoCandidato );
				}else {
					contagem.put( new Candidatos(votos[0]), vote );
				}
				
				dadosUrna = br.readLine();
			}
			
			for ( Candidatos nome : contagem.keySet() ) {				
					System.out.println(nome.getNome() + ": " + contagem.get(nome));	
				}
			
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();

	}

}

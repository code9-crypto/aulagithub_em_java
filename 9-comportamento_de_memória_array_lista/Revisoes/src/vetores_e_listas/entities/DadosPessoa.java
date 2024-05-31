package vetores_e_listas.entities;

public class DadosPessoa {

	private double altura;
	private char genero;
	
	public DadosPessoa() {
		
	}

	public DadosPessoa(double altura, char genero) {		
		this.altura = altura;
		this.genero = genero;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}
	
}

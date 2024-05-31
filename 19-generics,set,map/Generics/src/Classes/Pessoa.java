package Classes;

public class Pessoa {
	
	private String nome;
	private String idade;
	private Double altura;
	
	public Pessoa() {}
	
	public Pessoa(String nome, String idade, Double altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getIdade() {
		return this.idade;
	}
	
	public void setIdade(String idade) {
		this.idade = idade;
	}
	
	public Double getAltura() {
		return this.altura;
	}
	
	public void setAlgura(Double altura) {
		this.altura = altura;
	}
	
	public String toString() {
		return "Pessoa: " + this.nome + ", " + this.idade + ", " + this.altura + "\n"; 
	}

}

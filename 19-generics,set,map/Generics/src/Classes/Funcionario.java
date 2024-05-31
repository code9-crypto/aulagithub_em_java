package Classes;

public class Funcionario {
	
	private String nome;
	private String cargo;
	private Double salario;
	
	public Funcionario() {}
	
	public Funcionario(String nome, String cargo, Double salario) {
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}
	
	//Getters and Setters
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCargo() {
		return this.cargo;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public Double getSalario() {
		return this.salario;
	}
	
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	//Exibindo dados do funcionário
	public String toString() {
		return "Funcionário: " + this.nome + ", " + this.cargo + ", " + this.salario + "\n"; 
	}
}

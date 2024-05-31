package Classes;

public class Cliente {
	
	private String nome;
	private String vendedor;
	private String cep;
	
	public Cliente() {}
	
	public Cliente(String nome, String vendedor, String cep) {
		this.nome = nome;
		this.vendedor = vendedor;
		this.cep = cep;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getVendedor() {
		return this.vendedor; 
	}
	
	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}
	
	public String getCep() {
		return this.cep;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public String toString() {
		return "Cliente: " + this.nome + ", " + this.vendedor + ", " + this.cep + "\n";
	}

}

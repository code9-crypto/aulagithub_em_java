package banco;

public class Conta {
	
	private String numConta;
	private String titular;
	private double saldo;
	
	public Conta() {
		
	}
	
	public Conta(String titular, String numConta, double saldo) {
		this.titular = titular;
		this.numConta = numConta;
		this.saldo = saldo;
	}
	
	//getters e setter
	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public String getNumConta() {
		return numConta;
	}
	
	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	//métodos
	public void deposito(double valor) {
		saldo = saldo + valor;		
	}
	
	public void saque(double valor) {
		saldo = (saldo - valor) - 5.00;
	}
}
